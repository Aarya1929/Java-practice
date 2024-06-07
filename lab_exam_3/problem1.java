//Java Program to Reverse a String. 

package lab_exam_3;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();
		String rev = "";
		
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rev = ch+rev;
		}
		System.out.println("Reversed String:");
		System.out.println(rev);
	}
}
