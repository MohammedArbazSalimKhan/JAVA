package labpack;

public class SquareCube {

	public static void main(String[] args) {
		// Define the numbers
        int[] numbers = {2, 3, 4};

        // Calculate and output square and cube for each number
        for (int num : numbers) {
            // Calculate square
            int square = num * num;
            // Calculate cube
            int cube = num * num * num;

            // Output square and cube
            System.out.println("Square of " + num + ": " + square);
            System.out.println("Cube of " + num + ": " + cube);
        }
	}

}
