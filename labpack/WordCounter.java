package labpack;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        // Count the number of times the word is present in the sentence
        int count = countOccurrences(sentence, word);

        // Display the count
        System.out.println("The word '" + word + "' occurs " + count + " times in the sentence.");

        scanner.close();
    }

    public static int countOccurrences(String sentence, String word) {
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
