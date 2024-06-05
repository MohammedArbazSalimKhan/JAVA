package constructor;
import java.util.*;
public class Calculator {
	int x, y;
/*
	public Calculator()// Default constructor
	{
		x=0;
		y=0;
		
	}  */
	public Calculator()// no-args  constructor
	{
		System.out.println("hello , this is Arbaz!!!");
	}
	public Calculator(int a, int b) { // Parameterized constructor
		int sum=a+b;
		int div=a/b;
		int prod=a*b;
		int diff= a-b;
		System.out.println("The sum is :"+sum);
		System.out.println("The div is :"+div);
		System.out.println("The prod is :"+prod);
		System.out.println("The diff is :"+diff);
		
	}

	public static void main(String[] args) {
		Calculator cal= new Calculator(); // first constructor object 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two value");
		int c=sc.nextInt();
		int d=sc.nextInt();
		Calculator cc1=new Calculator(c,d); // second constructor object
	}

}
