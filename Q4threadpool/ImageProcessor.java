package Q4threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ImageProcessor {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<String>> results = new ArrayList<>(50);

        long start = System.currentTimeMillis();

        for (int i = 1; i <= 50; i++) {
            final int id = i;
            results.add(executor.submit(() -> {
                Thread.sleep(100);
                return "Image " + id + " processed";
            }));
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        for (Future<String> f : results) {
            try{
                System.out.println(f.get(200, TimeUnit.MILLISECONDS));
            }
            catch (TimeoutException e){
                System.err.println("Task timed out.");
            }
        }

        System.out.println("Total time: " + (System.currentTimeMillis() - start) + "ms");
    }
}