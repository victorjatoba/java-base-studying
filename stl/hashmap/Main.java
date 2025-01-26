import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a Java program that takes a sentence as input and counts how many times each word appears in the sentence. Use a
 * HashMap to store the word as the key and the frequency (count) as the value.
 * Input: "hello world hello"
 * Output:  hello: 2
 *          world: 1
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().trim();

        String[] words = sentence.split(" ");
        Map<String, Integer> wordsFrequency = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            wordsFrequency.merge(word, 1, Integer::sum);
        }

        wordsFrequency.forEach((k, v) -> System.out.println(k + " : " + v));

        scanner.close();
    }
}