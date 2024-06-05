package labpack;

public class SumSingleD {

	public static void main(String[] args) {
		// Define the example number
        int number = 38154;
        // Print the sum of digits of the number until it becomes a single digit
        System.out.println("The sum of digits of " + number + " until it becomes a single digit is: " + sumUntilSingleDigit(number));
    }

    // Recursive method to calculate the sum of the digits of a number until it becomes a single digit
    public static int sumUntilSingleDigit(int number) {
        // Base case: if the number is already a single digit, return it
        if (number < 10) {
            return number;
        }
        // Initialize the sum variable
        int sum = 0;
        // Loop through the number while it's greater than 0
        while (number > 0) {
            // Get the last digit of the number
            int digit = number % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit from the number
            number /= 10;
        }
        // Recursively call the method with the sum
        return sumUntilSingleDigit(sum);
	}

}
