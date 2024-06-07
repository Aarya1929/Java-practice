package lab_exams_17;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        // Read 10 strings from the console
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the strings
        Arrays.sort(strings);

        // Print the sorted strings
        System.out.println("\nSorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Combine two strings
        String combinedString = strings[0] + strings[1];
        System.out.println("\nCombined string: " + combinedString);

        // Reverse the first string
        StringBuilder reversedString = new StringBuilder(strings[0]);
        reversedString.reverse();
        System.out.println("\nReversed first string: " + reversedString);
    }
}
