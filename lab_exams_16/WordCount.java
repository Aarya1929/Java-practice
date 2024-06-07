package lab_exams_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        // Read input string from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split(" ");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                // If word already exists in the map, increment its count
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                // If word is encountered for the first time, add it to the map with count 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word count map
        System.out.println(wordCountMap);
    }
}

