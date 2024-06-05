
package basic;
import java.util.Scanner;

public class GreatestAnd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Entr the Number A : ");
		int A=sc.nextInt();
		System.out.println("Entr the Number B : ");
		int B=sc.nextInt();
		System.out.println("Entr the Number C : ");
		int C=sc.nextInt();
		
		int x=((A>B)?A:(B>C)?B:C );
		System.out.println("The Greatest number is: "+x);
	}
}
