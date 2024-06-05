package operaationjava;
import java.util.*;

public class OpCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double result = 0; // Variable to store the result

        System.out.println("Enter the first number:");
        a = sc.nextInt();

        System.out.println("Enter the second number:");
        b = sc.nextInt();

        System.out.println("What Operator you want to Perform?");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Result of Addition: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("Result of Subtraction: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("Result of Multiplication: " + result);
                break;
            case 4:
                // Check for division by zero
                if (b != 0) {
                    result = (double) a / b; // Cast to double for precise division
                    System.out.println("Result of Division: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
