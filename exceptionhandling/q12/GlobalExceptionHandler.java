package exceptionhandling.q12;

public class GlobalExceptionHandler {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((thread, exception) -> {
            System.err.println("Uncaught exception in thread: " + thread.getName());
            System.err.println("Exception message: " + exception.getMessage());
            exception.printStackTrace();
        });

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 running");
            throw new RuntimeException("Something went wrong in thread 1");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 running");
            throw new IllegalStateException("Problem in thread 2");
        });

        t1.start();
        t2.start();

        System.out.println("Main thread started");
    }
}
