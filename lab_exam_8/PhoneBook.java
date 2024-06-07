package lab_exam_8;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        // Read the phone book entries
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no .of entries:");
        int entries = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name and number:");
        for (int i = 0; i < entries; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            if(phoneNumber.charAt(0)=='0' || phoneNumber.length()>8)
            {
            	System.out.println("Enter 8 digit no. without starting with 0:");
            	phoneNumber = scanner.nextLine();
            }
            phoneBook.put(name, phoneNumber);
        }

        // Process the queries
        System.out.println("Enter query:");
        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();
            String phoneNumber = phoneBook.getOrDefault(query, "Not found");
            System.out.println(phoneNumber);
        }
    }
}
