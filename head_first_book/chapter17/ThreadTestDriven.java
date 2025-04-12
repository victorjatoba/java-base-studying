package head_first_book.chapter17;

public class ThreadTestDriven {
    public static void main(String[] args) {
        Thread t = new Thread(() ->
                System.out.println(Thread.currentThread().getName()));
        t.start();
        System.out.println("back in main");
    }
}
