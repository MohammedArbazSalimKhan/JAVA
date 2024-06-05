package labpack;

import java.util.Scanner;

public class InitialsDisplay {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a name with three words
        System.out.print("Enter a name (three words): ");
        String name = scanner.nextLine();

        // Split the name into words based on whitespace
        String[] words = name.split("\\s+");
        // Initialize a variable to store the initials
        String initials = "";
        // Iterate through each word to get the first letter
        for (String word : words) {
            initials += word.charAt(0) + " ";
        }

        // Display the initials
        System.out.println("Initials: " + initials.trim());

        // Close the scanner
        scanner.close();
    }
}
