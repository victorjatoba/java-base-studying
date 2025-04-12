package head_first_book.chapter17;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable("R0");
        Runnable runnable2 = new MyRunnable("R1");
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        System.out.println("main thread start..");
    }
}
