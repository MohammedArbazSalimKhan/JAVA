package labpack;

import java.util.Scanner;

public class SurnameFirst {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name with three words
        System.out.print("Enter a name (three words): ");
        String name = scanner.nextLine();

        // Split the name into words based on whitespace
        String[] words = name.split("\\s+");
        // Check if exactly three words are entered
        if (words.length == 3) {
            // Display the surname first followed by the first and middle names
            System.out.println("Formatted name: " + words[2] + " " + words[0] + " " + words[1]);
        } else {
            // Display an error message if not exactly three words are entered
            System.out.println("Please enter exactly three words.");
        }

        // Close the scanner
        scanner.close();
    }
}
