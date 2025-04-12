package head_first_book.chapter17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Running this code in another machine, could produce different results.
 */
public class ExecutorTestDrive {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() ->
                System.out.println("top 0' the stack"));

        System.out.println("back in main");
        executor.shutdown();
    }
}
