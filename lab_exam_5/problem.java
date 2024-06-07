//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.

package lab_exam_5;

import java.util.Scanner;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private int a;
    private int b;
    private int c;

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPercentage() {
        int totalMarks = a + b + c;
        return (double) totalMarks / 3;
    }
}

class B extends Marks {
    private int w;
    private int x;
    private int y;
    private int z;

    public B(int w, int x, int y, int z) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    double getPercentage() {
        int totalMarks = w + x + y + z ;
        return (double) totalMarks / 4;
    }
}

public class problem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 subjects marks for A(Out of 100):");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		A first = new A(a,b,c);
		double one = first.getPercentage();
		System.out.println("Percentage obtained by A: "+one);
		
		System.out.println("Enter 4 subjects marks for B(Out of 100):");
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		
		B second = new B(w,x,y,z);
		double two = second.getPercentage();
		System.out.println("Percentage obtained by B: "+two);
		
	}
}
