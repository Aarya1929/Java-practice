// Program to remove all repeated elements from an array   

package lab_exam_1;

import java.util.Scanner;

public class problem1 {
	
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
     
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements:");
		int n = sc.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		n = removeDuplicateElements(arr, n);  
	        for (int i=0; i<n; i++)  
	           System.out.print(arr[i]+" ");  
	}
}
