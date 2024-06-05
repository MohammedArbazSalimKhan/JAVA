package labpack;

import java.util.Scanner;

public class LongWordInSentence {

	  public static void main(String[] args) {
	        // Create a Scanner object for input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a sentence
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();
	        // Split the sentence into words based on whitespace
	        String[] words = sentence.split("\\s+");

	        // Initialize the longest word variable
	        String longestWord = "";
	        // Iterate through each word to find the longest one
	        for (String word : words) {
	            if (word.length() > longestWord.length()) {
	                longestWord = word;
	            }
	        }

	        // Display the longest word
	        System.out.println("The longest word is: " + longestWord);

	        // Close the scanner
	        scanner.close();
	    }
	}