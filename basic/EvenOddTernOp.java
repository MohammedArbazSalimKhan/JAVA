package basic;
import java.util.Scanner;

public class EvenOddTernOp {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Entr the Number A : ");
		int A=sc.nextInt();
		
		String x=((A%2==0)? "Even Number":"Odd Number");
		System.out.println(x);
	
	}

}
