package thread;

public class Five9Interview {
    static final Object var1 = new Object();
    static final Object var2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
        System.out.println("done");
    }

    static class Thread1 extends Thread {
        public void run() {
            synchronized (var2) {
                System.out.println("Text 1");
                try {
                    Thread.sleep(10000); // Sleep for 10 seconds
                } catch (InterruptedException e) {
                    System.out.println("Text 2");
                }
                System.out.println("Thread1 accessed var1: " + var1);
            }
        }
    }

    static class Thread2 extends Thread {
        public void run() {
            synchronized (var1) {
                System.out.println("Text 3");
                try {
                    Thread.sleep(10000); // Sleep for 10 seconds
                } catch (InterruptedException e) {
                    System.out.println("Text 4");
                }
                System.out.println("Thread2 accessed var2: " + var2);
            }
        }
    }
}
