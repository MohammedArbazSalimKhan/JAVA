package labpack;
import java.util.Arrays;
import java.util.Scanner;

public class StringAscending {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of strings with validation
        int n = 0;
        while (true) {
            System.out.print("Enter the number of strings: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                if (n > 0) {
                    break; // Valid number of strings
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        // Initialize the array to store the strings
        String[] strings = new String[n];
        // Prompt the user to enter each string
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Sort the array of strings in ascending order
        Arrays.sort(strings);

        // Display the sorted strings
        System.out.println("Sorted strings in ascending order:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Close the scanner
        scanner.close();
    }
}
