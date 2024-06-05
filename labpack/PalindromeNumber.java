// 1. WAP to find whether the given no by user is palindrome or not.eg: 121 reverse=121
package labpack;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to input the number
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();
        
        // Initialize variables for calculation
        int rem, sum = 0, temp;
        temp = num; // Store the original number in a temporary variable
        
        // Reverse the number and store it in 'sum'
        while (num > 0) {
            rem = num % 10; // Get the last digit of the number
            sum = (sum * 10) + rem; // Add the last digit to 'sum' in reverse order
            num = num / 10; // Remove the last digit from the number
        }
        
        // Check if the reversed number is equal to the original number
        if (temp == sum) {
            System.out.println("The Given Number is A Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
        
        sc.close(); // Close the scanner
    }
}
