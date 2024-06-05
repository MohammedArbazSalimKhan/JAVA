package labpack;

import java.util.Scanner;

public class PigLatinConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toUpperCase();

        // Convert the word to Pig Latin
        String pigLatinWord = convertToPigLatin(word);

        // Display the Pig Latin word
        System.out.println("Pig Latin: " + pigLatinWord);

        scanner.close();
    }

    public static String convertToPigLatin(String word) {
        // Check if the first character is a vowel
        if (isVowel(word.charAt(0))) {
            return word;
        }

        // Find the index of the first vowel
        int vowelIndex = -1;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                vowelIndex = i;
                break;
            }
        }

        // If no vowel is found, return the word unchanged
        if (vowelIndex == -1) {
            return word;
        }

        // Create the Pig Latin word
        String pigLatinWord = word.substring(vowelIndex) + word.substring(0, vowelIndex) + "AY";
        return pigLatinWord;
    }

    public static boolean isVowel(char c) {
        return "AEIOU".indexOf(c) != -1;
    }
}
