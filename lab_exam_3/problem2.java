//Write a Java program to check that String is palindrome or not.

package lab_exam_3;

import java.util.Scanner;

public class problem2 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
		String rev = "";
		
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rev = ch+rev;
		}
		
		if(str.equals(rev)) {
			System.out.println("Yes, a palindrome.");
		}
		else
		{
			System.out.println("No, not a palindrome.");
		}
	}
}
