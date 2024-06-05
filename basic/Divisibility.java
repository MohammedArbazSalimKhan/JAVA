package basic;
import java.util.Scanner;
public class Divisibility {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Array Elements :");
		int arr[]=new int[10];
		
		for (int i=0;i < arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The Number Divisible by 2 is ");
		for(int i=0; i<arr.length;i++) {
			
			if (arr[i] %2==0) {
				System.out.print(arr[i]+" ");
				

			}
			
		}
		System.out.println("\n The Number Divisible by 3 is ");

		for(int i=0; i<arr.length;i++) {
					
					if (arr[i] %3==0) {
						System.out.print(arr[i]+" ");
						
		
					}
					
				
				}
		
	}

}
