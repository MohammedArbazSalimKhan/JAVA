package labpack;

import java.util.Scanner;

public class StringPalindrom {

    public static boolean isPalindrome(String s) {
        // Remove any non-alphanumeric characters and convert the string to lowercase
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Get the length of the cleaned string
        int length = cleanedString.length();
        
        // Check if the cleaned string is equal to its reverse
        for (int i = 0; i < length / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString = scanner.nextLine();
        
        // Check if the input string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("'" + inputString + "' is a palindrome.");
        } else {
            System.out.println("'" + inputString + "' is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
