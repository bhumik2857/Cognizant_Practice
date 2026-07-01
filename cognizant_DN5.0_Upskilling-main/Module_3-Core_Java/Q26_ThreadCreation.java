public class Q26_ThreadCreation {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) System.out.println("Thread 1: Message " + i);
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) System.out.println("Thread 2: Message " + i);
        });
        t1.start(); t2.start();
        t1.join(); t2.join();
    }
}
