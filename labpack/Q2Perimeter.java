// 2. Write a class with the name Perimeter using function overloading that computes the perimeter of a square, a rectangle and a circle.
package labpack;
import java.util.Scanner;
import java.util.*;

public class Q2Perimeter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("\n Plz Enter your Choice: "+"\n 1: Perimeter of the Square. \n 2 :Perimeter of the Rectangle. \n 3:Perimeter of the Circle. ");
		int choice=scanner.nextInt();
		
		switch (choice) { //using swith case 
		case 1: {
			System.out.println("Enter the side of the Square: ");// Taking input as a side of the square
			int side=scanner.nextInt();
			double perimetr_of_Square=4 * side;// formula : Perimeter of a square = 4 * s
			System.out.println("The Perimeter  of the Square is : "+perimetr_of_Square );
			break;
		}
		case 2: {
			System.out.println("Enter the lenght of the rectangle (l): ");// taking input as a length
			int l =scanner.nextInt();
			System.out.println("Enter the breath of the rectangle (b): "); // taking input as breath
			int b=scanner.nextInt();
			double perimetr_of_rectangle=2*(l+b);// formula :Perimeter of a rectangle = 2 * (l + b)
			System.out.println("The Perimeter  of the Square is : "+perimetr_of_rectangle );
			break;
		}
		case 3: {
			System.out.println("Enter the radius of the Circle: "); // taking input as radius
			int radius=scanner.nextInt();
			double perimetr_of_circle=2* 3.14*radius; //formula: Perimeter of a circle = 2 * (22/7) * r
			System.out.println("The Perimeter  of the Circle is : "+perimetr_of_circle );
			break;
			
		}
		default :{
			System.out.println("Wrong Choice !!!!!!!!!!!!!!!!");
			break;
		}
		}

	}

}
