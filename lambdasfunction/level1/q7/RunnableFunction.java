package lambdasfunction.level1.q7;

public class RunnableFunction {
    public static void main(String[] args) {
        // Runnable: prints "Hello Functional Java"
        Runnable helloRunnable = () -> System.out.println("Hello Functional Java");
        helloRunnable.run();

    }
}
