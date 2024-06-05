package labpack;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            // Demonstrate an ArithmeticException
            int a = 10;
            int b = 0;
            int c = a / b; // This line will throw ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }
    }
}
