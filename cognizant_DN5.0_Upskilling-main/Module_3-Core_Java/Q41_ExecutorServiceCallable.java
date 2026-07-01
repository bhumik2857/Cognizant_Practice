import java.util.*;
import java.util.concurrent.*;

public class Q41_ExecutorServiceCallable {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            final int n = i;
            futures.add(executor.submit(() -> {
                System.out.println("Task " + n + " on " + Thread.currentThread().getName());
                return n * n;
            }));
        }
        for (Future<Integer> f : futures)
            System.out.println("Result: " + f.get());
        executor.shutdown();
    }
}
