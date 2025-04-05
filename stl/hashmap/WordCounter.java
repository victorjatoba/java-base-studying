package stl.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentance = sc.nextLine().trim();

        HashMap<String, Integer> wordsMap = new HashMap<>();
        List<String> wordsList = new ArrayList<>();
        sentance.split()
    }
}
