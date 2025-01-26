import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * Write a Java program that takes a sentence as input and counts how many times each word appears in the sentence. Use a HashMap to store the word as the key and the frequency (count) as the value.
 *
 * Input: "hello world hello"
 * Output: hello: 2
 *         world: 1
 *
 */
class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().trim();

        v1(sentence);
        v2(sentence);
        scanner.close();
    }

    public static void v2(String sentence) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word: sentence.split(" ")) {
            word = word.toLowerCase();
            wordCountMap.merge(word, 1, Integer::sum);
        }

        wordCountMap.forEach((word, count) -> System.out.println(word + " : " + count));
    }

    public static void v1(String sentence) {
        String[] words = sentence.split(" ");

        HashMap<String, Integer> wordTimeCounter = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            Integer counter = wordTimeCounter.get(word);
            Integer counterIncremented = counter == null ? 0 : counter;
            wordTimeCounter.put(word, counterIncremented + 1);
        }

        System.out.println(wordTimeCounter);
    }
}
