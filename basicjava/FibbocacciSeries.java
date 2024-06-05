package basicjava;
import java.util.*;


public class FibbocacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr the Number of the Count :");
		int count=sc.nextInt();
		int a=0,b=1;
		
		
		System.out.println("The Fibbonacci Series is :");
			for (int i=0;i <=count;i++) {
				System.out.println(a + " ");
			int next=a+b;
			a=b;
			b=next;
			
		}
		
	}

}
