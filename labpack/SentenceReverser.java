package labpack;

import java.util.Scanner;

public class SentenceReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Reverse the sentence
        String reversedSentence = reverseSentence(sentence);

        // Display the reversed sentence
        System.out.println("Reversed sentence: " + reversedSentence);

        scanner.close();
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}
