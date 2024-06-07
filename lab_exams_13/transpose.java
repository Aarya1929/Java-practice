package lab_exams_13;

import java.util.Scanner;

public class transpose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial no .of rows:");
		int r = sc.nextInt();
		System.out.println("Enter initial no .of columns:");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		int[][] rev = new int[c][r];
		
		System.out.println("Enter elements:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Transpose");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println(" ");
		}
	}
}
