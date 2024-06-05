/* 3. Write a program to find the Lowest Common Multiple (LCM) of two numbers by GCD (Greatest Common Divisor) of the numbers. GCD of two integers is calculated by continued division method. Divide the larger number by the smaller, the remainder then divides the previous divisor. The process is repeated till the remainder is zero. The divisor then results in the GCD.
LCM = product of two numbers / GCD */
package labpack;
import java.util.Scanner;

public class LCMUsingGCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to input the first number
        System.out.println("Enter the First Number:");
        int a = sc.nextInt();
        
        // Prompt the user to input the second number
        System.out.println("Enter the Second Number:");
        int b = sc.nextInt();
        
        // Calculate the product of the two numbers
        int prod = a * b;
        
        // Initialize variables to store LCM and GCD
        int lcm = 0, gcd = 1;
        
        // Loop to find the Greatest Common Divisor (GCD)
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                // Update GCD if 'i' divides both 'a' and 'b'
                gcd = i;
            }
            // Calculate LCM using the formula LCM = (a * b) / GCD
            lcm = prod / gcd;
        }
        
        // Print the LCM of the two numbers using GCD
        System.out.println("LCM of the Two numbers Using GCD of Two numbers is: " + lcm);

        sc.close(); // Close the scanner
    }
}
