import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int size = 1_000_000; // One million elements
        Integer[] array = new Integer[size];
        Random random = new Random();

        // Part 1: Filling the array
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size); // Fill with random values
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time to fill the array: " + (endTime - startTime) + " ms");

        // Part 2: Shuffling the array
        startTime = System.currentTimeMillis();
        Collections.shuffle(Arrays.asList(array));
        endTime = System.currentTimeMillis();
        System.out.println("Time to shuffle the array: " + (endTime - startTime) + " ms");

        // Part 3: Sorting the array
        startTime = System.currentTimeMillis();
        Arrays.sort(array);
        endTime = System.currentTimeMillis();
        System.out.println("Time to sort the array: " + (endTime - startTime) + " ms");
    }
}
