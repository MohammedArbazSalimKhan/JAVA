package basicjava;
import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,sum = 0,rem,square;
		
		num=sc.nextInt();
		square=num*num;
		while(square > 0) {
			rem=square% 10;
			sum=sum+rem;
			square=square/10;
			
		}
		if (sum==num)
			System.out.println("Neon Number");
		else System.out.println("Not a Neon Number");
	}

}
