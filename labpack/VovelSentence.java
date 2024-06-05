package labpack;

import java.util.Scanner;

public class VovelSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowels = 0, digits = 0, words = 0, specialChars = 0;
        String vowelsList = "AEIOUaeiou";

        for (char ch : sentence.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                if (vowelsList.indexOf(ch) != -1) {
                    vowels++;
                }
            } else if (ch == ' ') {
                words++;
            } else {
                specialChars++;
            }
        }

        // Adding one to words to account for the last word (words are separated by spaces)
        words++;

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of words: " + words);
        System.out.println("Number of special characters: " + specialChars);

        scanner.close();
    }
}
