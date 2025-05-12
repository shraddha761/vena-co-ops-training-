package exceptionhandling.q11;

public class UncaughtException {
    public static void main(String[] args) {
        Runnable faultyTask = () -> {
            System.out.println("Child thread started...");
            throw new RuntimeException("Something went wrong in child thread");
        };

        Thread thread = new Thread(faultyTask);

        thread.setUncaughtExceptionHandler((t, e) -> {
            System.err.println("Exception caught in thread: " + t.getName());
            System.err.println("Exception message: " + e.getMessage());
        });

        thread.start();

        System.out.println("Main thread continuous running...");
    }
}