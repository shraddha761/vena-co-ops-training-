package Q1loggingsystem;

public class LoggerTest {
    public static void main(String[] args) throws Exception {
        Logger logger = new Logger(true, "logs.txt"); // File based flushing
        // Logger logger = new Logger();  // Log to console

        int threadCount = 100;
        int messagePerThread = 100;
        Thread[] threads = new Thread[threadCount];

        for(int t = 0; t < threadCount; t++) {
            final int threadId = t;
            threads[t] = new Thread(() -> {
                for(int i=0;i < messagePerThread;i++){
                    Logger.Level level = Logger.Level.INFO;
                    if(i % 33 == 0) level = Logger.Level.WARN;
                    if(i % 77 == 0) level = Logger.Level.ERROR;
                    logger.log("Thread " + threadId + ": " + "Message " + i , level);
                }
            });
            threads[t].start();
        }
        for(Thread thread : threads) thread.join();

        logger.shutdown();
    }
}
