package head_first_book.chapter17;

public class MyRunnable implements Runnable {
    public String message;

    MyRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        go();
    }

    private void go() {
        doMore();
    }

    private void doMore() {
        System.out.println(Thread.currentThread().getName() + ": it's me " + message);
        Thread.dumpStack();
    }
}
