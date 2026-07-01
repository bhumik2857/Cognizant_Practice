public class Q40_VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        int count = 100_000;
        long start = System.currentTimeMillis();
        Thread[] threads = new Thread[count];
        for (int i = 0; i < count; i++) {
            final int id = i;
            threads[i] = Thread.startVirtualThread(() ->
                System.out.println("Virtual thread " + id));
        }
        for (Thread t : threads) t.join();
        System.out.println("Done in: " + (System.currentTimeMillis() - start) + "ms");
    }
}
