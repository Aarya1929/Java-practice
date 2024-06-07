//Write a Java program to find the common elements between two arrays of integers.

package lab_exam_1;

import java.util.Scanner;

public class problem2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n1,n2;
			System.out.print("Enter two numbers:");
			n1=sc.nextInt();
			n2=sc.nextInt();
			
			int [] arr1 = new int[n1];
			int [] arr2 = new int[n2];
					
			System.out.println("Enter first array:");
			for(int i=0;i<n1;i++)
			{
				arr1[i]=sc.nextInt();
			}
			System.out.println("Enter second array:");
			for(int i=0;i<n2;i++)
			{
				arr2[i]=sc.nextInt();
			}
			
			System.out.println("Common elements:");
			for(int i=0;i<n1;i++)
			{
				for(int j=0;j<n2;j++)
				{
					if(arr1[i]==arr2[j])	
					{
						System.out.println(arr1[i]);
					}
				}
			}
		}
}
