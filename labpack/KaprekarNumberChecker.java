/* 6.    Write a program to input a number and check whether it is a Kaprekar number or not. Take a positive whole number n that has d number of digits. Take the square n and separate the result into two pieces: a right-hand piece that has d digits and a left-hand piece that has either d or d-1 digits. Add these two pieces together. If the result is n, then n is a Kaprekar number. Examples are 9 (92 = 81, 8 + 1 = 9), 45 (452 = 2025, 20 + 25 = 45), and 297 (2972 = 88209, 88 + 209 = 297) */

package labpack;

import java.util.Scanner; //to import scanner class

public class KaprekarNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //making object of scanner class to take user input
        
        // Accept a positive whole number from the user
        System.out.print("Enter a positive whole number: ");
        int number = scanner.nextInt(); //storing positive number
        
        // Calculate the square of the number
        long square = (long) number * number;
        
        // Count the number of digits in the original number
        int numDigits = String.valueOf(number).length();
        
        // Separate the square into two pieces
        String squareStr = String.valueOf(square);
        int length = squareStr.length();
        String left = squareStr.substring(0, length - numDigits);
        String right = squareStr.substring(length - numDigits);
        
        // Convert the two pieces to integers
        int leftNum = (left.isEmpty()) ? 0 : Integer.parseInt(left);
        int rightNum = Integer.parseInt(right);
        
        // Check if the sum of the two pieces equals the original number
        if (leftNum + rightNum == number) 
        {
            System.out.println(number + " is a Kaprekar number."); //if condition is true
        } 
        else 
        {
            System.out.println(number + " is not a Kaprekar number.");//if condition is false
        }

	}

}
