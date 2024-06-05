package basicjava;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		long fact=1;
		System.out.println("Enter the Number :");
		num=scanner.nextInt();
		for (int i=1;i <= num; i++) {
			fact*=i;
		}
		System.out.println("Factorial of the given number is : "+fact);
	}

}
