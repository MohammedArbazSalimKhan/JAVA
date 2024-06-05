package labpack; // Package Declaration
import java.util.Scanner; // importing Scanner class from java.util package

public class SumOfNumbers { // declaration of a class

	 public static void main(String[] args) {  // main method declaration
	        Scanner scanner = new Scanner(System.in); // creating object to take input from the user

	        // Variables to store sum of two-digit and three-digit numbers
	        int sumTwoDigit = 0;
	        int sumThreeDigit = 0;

	        // Input 10 integers
	        System.out.println("Enter 10 integers:");
	        for (int i = 0; i < 10; i++) {
	            int number = scanner.nextInt();
	            // Check if the number is two-digit or three-digit
	            if (number >= 10 && number <= 99) {
	                sumTwoDigit += number; // Add to sum of two-digit numbers
	            } else if (number >= 100 && number <= 999) {
	                sumThreeDigit += number; // Add to sum of three-digit numbers
	            }
	        }

	        // Output the sums
	        System.out.println("Sum of two-digit numbers: " + sumTwoDigit);
	        System.out.println("Sum of three-digit numbers: " + sumThreeDigit);
	    }
	}