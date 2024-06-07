package lab_exams_15;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        // Create the ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Iterate using for-loop
        System.out.println("Using for-loop:");
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println(number);
        }

        // Iterate using iterator
        System.out.println("\nUsing iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }

        // Iterate using advanced for-loop
        System.out.println("\nUsing advanced for-loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
