package lab_exams_11;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no.:");
		int n = sc.nextInt();
		
		System.out.println("Table:");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i +" = "+ n*i);
		}
	}
}
