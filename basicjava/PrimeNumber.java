package basicjava;
import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        boolean prime = true; // Assume the number is prime initially

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false; // If divisible, then not prime
                break; // No need to continue checking
            }
        }

        // Check if the number is prime or not and print the result
        if (prime && num > 1) {
            System.out.println("The given number is a prime number: " + num);
        } else {
            System.out.println("The given number is not a prime number: " + num);
        }
    }
}
