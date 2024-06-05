package labpack; // Package declaration

import java.util.Scanner; // Importing Scanner class from java.util package

public class BuzzNumber { // Class declaration

    public static void main(String[] args) { // Main method declaration
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for input
        System.out.println("Enter the Number : "); // Prompting the user to enter a number
        int num = sc.nextInt(); // Reading the input number from the user
        if (num % 10 == 7 && num % 7 == 0) { // Checking if the number is divisible by 7 and ends with 7
            System.out.println("The number is a Buzz number."); // Printing if the number is a Buzz number
        } else { // If the conditions are not met
            System.out.println("Not a Buzz number!"); // Printing if the number is not a Buzz number
        }
        sc.close(); // Closing the Scanner object to prevent resource leak
    }
}

