package lab_exams_11;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,m=0,flag=0;
		System.out.println("Enter a no.:");
		n=sc.nextInt();
		
		if(n==0||n==1)
		{
			System.out.println("Not prime");
		}
		else
		{
			m=n/2;
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("Not prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Prime");
			}
		}
	}
}

