package labpack; // package declaration
import java.util.Scanner; // import Scanner class from java.util

public class StateCapitalSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare arrays for states and capitals with size 10
        String[] states = new String[10];
        String[] capitals = new String[10];

        // Input states and capitals
        System.out.println("Enter the states and capitals:");
        for (int i = 0; i < 10; i++) {
            System.out.print("State " + (i + 1) + ": ");
            states[i] = scanner.next();
            System.out.print("Capital " + (i + 1) + ": ");
            capitals[i] = scanner.next();
        }

        // Search for a state's capital
        System.out.println("\nEnter the state whose capital is to be searched:");
        String searchState = scanner.next();

        // Find and display the capital
        for (int i = 0; i < 10; i++) {
            if (states[i].equalsIgnoreCase(searchState)) {
                System.out.println("The capital is " + capitals[i]);
                break;
            }
        }

        // If the state is not found
        if (searchState.equalsIgnoreCase(states[0])) {
            System.out.println("The state is not found.");
        }

        scanner.close(); // close Scanner
    }
}
