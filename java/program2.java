package program2;
import java.util.*;
public class Calculator {
	String a;
	void add(int a , int b) {
		int result=a+b;
	}
	void add(float a, float b) {
		System.out.println("Decimal addition of two numbers is: "+(a+b));
	}
	void add(int a , int b, int c) {
		System.out.println("Integral addition of three numbers is: "+(a+b+c));
	}
	void add(float a, float b,float c) {
		System.out.println("Decimal addition of three numbers is: "+(a+b+c));
	}
	public static void main(String[] args) {
		try {
		System.out.println("METHOD OVERLOADING");
		Scanner s1 = new Scanner(System.in);
		Calculator obj=new Calculator();
		
		do {
		System.out.println("Please enter 1 if you want to add two integer numbers.");
		System.out.println("Please enter 2 if you want to add two decimal numbers.");
		System.out.println("Please enter 3 if you want to add three integer numbers.");
		System.out.println("Please enter 4 if you want to add three decimal numbers.");
		int input= s1.nextInt();
		switch(input) {
		case 1:{
			try {
				System.out.println("Please enter the two integer numbers");
				System.out.println("A: ");
				int a = s1.nextInt();
				System.out.println("B: ");
				int b= s1.nextInt();
				obj.add(a, b);
				System.out.println("Enter y to keep executing the code");
				obj.a=s1.next();
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception occurs");
				System.out.println(e);
			}catch(InputMismatchException e) {
				System.out.println("Input Mismatch Exception occurs");
				System.out.println(e);
			}finally {
				System.out.println("An unknown exception occured");
			}
				break;
			}
		case 2:{
			try {
				System.out.println("Please enter the two decimal numbers");
				System.out.println("A: ");
				float a = s1.nextFloat();
				System.out.println("B: ");
				float b = s1.nextFloat();
				obj.add(a, b);
				System.out.println("Enter y to keep executing the code");
				obj.a=s1.next();
			}catch(Exception e) {
				System.out.println("An Exception occurs");
				System.out.println(e);
			}finally {
				System.out.println("An unknown exception occured");
			}
				break;
			}
		case 3: {
			try {
				System.out.println("Please enter the two integer numbers");
				System.out.println("A: ");
				int a = s1.nextInt();
				System.out.println("B: ");
				int b= s1.nextInt();
				System.out.println("C: ");
				int c= s1.nextInt();
				obj.add(a, b,c);
				System.out.println("Enter y to keep executing the code");
				obj.a=s1.next();
			}catch(Exception e) {
				System.out.println("An Exception occurs");
				System.out.println(e);
			}finally {
				System.out.println("An unknown exception occured");
			}
				break;
			}
		case 4:{
			try {
				System.out.println("Please enter the three decimal numbers");
				System.out.println("A: ");
				float a = s1.nextFloat();
				System.out.println("B: ");
				float b = s1.nextFloat();
				System.out.println("C: ");
				float c = s1.nextFloat();
				obj.add(a, b,c);
				System.out.println("Enter y to keep executing the code");
				obj.a=s1.next();
			}catch(Exception e) {
				System.out.println("An Exception occurs");
				System.out.println(e);
			}finally {
				System.out.println("An unknown exception occured");
			}
				break;
			}
		default: {
			System.out.println("Invalid input");
		}
		}
		}while(obj.a=="y");
		}catch(Exception e) {
			System.out.println(e);
		}
		}
}
