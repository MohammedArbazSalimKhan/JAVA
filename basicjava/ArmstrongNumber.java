package basicjava;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num,copy,rem,sum=0;
		num=sc.nextInt();
		copy=num;
		while (num!=0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
			
		}
		if(copy==sum) {
			System.out.println("The given Number is a ArmStrong Number");
		}
		else {
			System.out.println("The given Number is not a Armstrong Number!!!!");
		}
		
	}

}
