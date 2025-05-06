package Q1loggingsystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Logger {

    public enum Level { INFO, WARN, ERROR }

    private static class LogEntry {
        final String timestamp;
        final Level level;
        final String message;

        LogEntry(String message, Level level) {
            this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
            this.level = level;
            this.message = message;
        }

        @Override
        public String toString() {
            return String.format("%s [%s] %s", timestamp, level, message);
        }
    }

    private final BlockingQueue<LogEntry> queue = new LinkedBlockingQueue<>();
    private final Thread flushThread;
    private volatile boolean running = true;
    private final boolean toFile;
    private final String filePath;
    private BufferedWriter fileWriter;

    public Logger() throws IOException {
        this(false, null);
    }

    public Logger(boolean toFile, String filePath) throws IOException {
        this.toFile = toFile;
        this.filePath = filePath;
        if (toFile) {
            fileWriter = new BufferedWriter(new FileWriter(filePath, true));
        }
        flushThread = new Thread(this::flushLoop, "Logger-Flush-Thread");
        flushThread.start();
    }

    public void log(String message) {
        log(message, Level.INFO);
    }

    public void log(String message, Level level) {
        queue.offer(new LogEntry(message, level));
    }

    private void flushLoop() {
        try {
            while (running || !queue.isEmpty()) {
                long flushDeadline = System.currentTimeMillis() + 5000;
                while (System.currentTimeMillis() < flushDeadline && running) {
                    LogEntry entry = queue.poll(flushDeadline - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                    if (entry != null) {
                        write(entry);
                    }
                }
                flush();
            }
            // Final flush after shutdown
            flush();
        } catch (InterruptedException ignored) {
        } finally {
            try {
                if (toFile && fileWriter != null) fileWriter.close();
            } catch (IOException ignored) {}
        }
    }

    private void write(LogEntry entry) {
        try {
            if (toFile && fileWriter != null) {
                fileWriter.write(entry.toString());
                fileWriter.newLine();
            } else {
                System.out.println(entry.toString());
            }
        } catch (IOException e) {
            System.err.println("Logger write failed: " + e.getMessage());
        }
    }

    private void flush() {
        try {
            if (toFile && fileWriter != null) {
                fileWriter.flush();
            }
        } catch (IOException e) {
            System.err.println("Logger flush failed: " + e.getMessage());
        }
    }

    public void shutdown() {
        running = false;
        flushThread.interrupt();
        try {
            flushThread.join();
        } catch (InterruptedException ignored) {}
    }
}
