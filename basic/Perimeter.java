////WAP to find the perimeter of a square, rectangle, triangle using switch case
package basic;
import java.util.Scanner;

public class Perimeter {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Plz enter Your Choice : "+("\n Press \n 1. Perimeter of the Square\n 2: Perimeter of the Triangle\n 3: Perimeter of the Rectangle:"));
		int choice=sc.nextInt();
		
		switch (choice) {
		case 1:{
			System.out.println("Enter the side of square :");
			int side=sc.nextInt();
			double perimeter_of_square =4*side; //formula for perimeter of the square
			System.out.println("perimiter of the Square is :"+perimeter_of_square);
			break;
			
		}
		case 2:{
			System.out.println("Enter the side of triangle a :");
			int a=sc.nextInt();
			System.out.println("Enter the side of triangle b :");
			int b=sc.nextInt();
			System.out.println("Enter the side of triangle c :");
			int c=sc.nextInt();
			double perimeter_of_triangle =a+b+c; //calculating perimeter of the triangle
			System.out.println("perimiter of the Square is :"+perimeter_of_triangle);
			break;
			
		}
		case 3:{
			System.out.println("Enter the lenght of Rectangle (l) :");
			int l=sc.nextInt();
			System.out.println("Enter the breath of Rectangle (b) :");
			int b=sc.nextInt();
			double perimeter_of_rectangle =2*(l+b); // calculating the perimetr of the Rectangle
			System.out.println("perimiter of the Square is :"+perimeter_of_rectangle);
			break;
			
		}
		
		}
		
	}

}
