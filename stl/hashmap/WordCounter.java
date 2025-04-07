package stl.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentance = sc.nextLine().trim();

        HashMap<String, Integer> wordsMap = new HashMap<>();
        List<String> sentences = List.of(sentance.split(" "));

        sentences.forEach(s -> wordsMap.merge(s, 1, Integer::sum));
        wordsMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        System.out.println(" ");
        wordsMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        System.out.println(" ");
        wordsMap.forEach((k, v) -> System.out.println(k + ": " + v));
        sc.close();
    }
}
