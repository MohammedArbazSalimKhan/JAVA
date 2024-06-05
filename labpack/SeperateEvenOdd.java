package labpack; // package declaration
import java.util.Scanner; // importing the Scanner class from java.util 

public class SeperateEvenOdd {  // class declaration

	public static void main(String[] args) { // main method declaration
		Scanner sc=new Scanner(System.in); // creating object to taking input from the user
		System.out.println("Enten the Element of the array: "); // displaying to input the size of the array
		// creating three array of size 20 for main array and 10 for other array
		int[] arr=new int[20];
		int[] even=new int[10];
		int[] odd =new int[10];
		int evencount=0,oddcount=0;  // initializing the variable 
		
		// taking input from the user
		for (int i=0;i<20;i++) {
			arr[i]=sc.nextInt();
		}
		// Printing the array elements
		System.out.println("The Array elements are: ");
		for (int i=0; i<20;i++) {
			System.out.print(arr[i]+" ");
		}
		// storing even or odd number in the variable
		for (int i=0;i<20;i++) {
			if(arr[i]%2==0) {
				even[evencount++]=arr[i];
			}
			else {
				odd[oddcount++]=arr[i];
				
			}
		}
		// displaying array of the even number
		System.out.println("Array of the even number is :");
		for(int i=0;i<evencount;i++) {
			System.out.print(" \n"+even[i]+" ");
			
		}
		// Displaying the array of the odd number
		System.out.println("Array of the odd number is :");
		for(int i=0;i<oddcount;i++) {
			System.out.print("\n"+odd[i]+" ");
			
		}
	sc.close(); // closing the Scanner class
	}
}


