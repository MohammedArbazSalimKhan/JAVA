// 2. Write a Java Program to find the second highest value in a numeric array.
package labpack;
import java.util.Scanner;

public class ArraySecLarg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements of the Array: ");
        int[] array = new int[10];

        // Taking input for the array
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // Printing the elements of the array
        System.out.print("Entered Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Finding the second largest element
        int greatest = Integer.MIN_VALUE; // Initialize the greatest value to the minimum integer value
        int seclargest = Integer.MIN_VALUE; // Initialize the second largest value to the minimum integer value
        for (int i = 0; i < array.length; i++) {
            if (array[i] > greatest) {
                seclargest = greatest; // Update the second largest value
                greatest = array[i]; // Update the greatest value
            } else if (array[i] > seclargest && array[i] != greatest) {
                seclargest = array[i]; // Update the second largest value
            }
        }

        // Printing the second largest element
        System.out.println("Second Largest Element: " + seclargest);

        sc.close(); // Close the scanner
    }
}
