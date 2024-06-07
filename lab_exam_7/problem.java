package lab_exam_7;

import java.util.Scanner;

class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}


public class problem {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        MyCalculator calculator = new MyCalculator();
	        int a,b;
	        System.out.println("Enter base and power: ");
	        a = sc.nextInt();
	        b = sc.nextInt();
	        try {
	            long result1 = calculator.power(a,b);
	            System.out.println("Result: " + result1);

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
