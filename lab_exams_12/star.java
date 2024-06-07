package lab_exams_12;

import java.util.Scanner;

public class star {
	public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows: ");
       int n=sc.nextInt(); 
       int i, j;
       for (i = 0; i < n; i++)
       {
            for (j = 0; j < i + 1; j++)
               System.out.print("*");
          System.out.print("\n");
       }
       for (i = 1; i < n; i++) 
       {
           for (j = i; j < n; j++)
              System.out.print("*");
         System.out.print("\n");
       }
	    }
}
