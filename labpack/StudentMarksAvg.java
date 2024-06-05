package labpack; // package declaration
import java.util.Scanner; // importing the Scanner class from java.util 

/**
 * This program calculates and displays the average marks for each subject (English, Maths, and Science)
 * for a class of 40 students. It also calculates and displays the class average in each subject.
 */
public class StudentMarksAvg { // class declaration

    public static void main(String[] args) { // main method declaration
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declare arrays to store the marks for each subject
        int[] English = new int[40];
        int[] Maths = new int[40];
        int[] Science = new int[40];

        // Variables to store the total and average marks for each student
        double engAvg = 0;
        double mathAvg = 0;
        double sciAvg = 0;
        double tot = 0;
        double avg = 0;

        // Prompt the user to enter the English subject marks
        System.out.println("Enter the English Subject Marks :");
        for (int i = 0; i < 40; i++) {
            // Read the English mark from the user and store it in the array
            English[i] = sc.nextInt();
        }

        // Repeat the process for Maths and Science subjects
        System.out.println("Enter the Maths Subject Marks :");
        for (int i = 0; i < 40; i++) {
            Maths[i] = sc.nextInt();
        }

        System.out.println("Enter the Science Subject Marks :");
        for (int i = 0; i < 40; i++) {
            Science[i] = sc.nextInt();
        }

        // Calculate the average marks for each student
        for (int i = 0; i < 40; i++) {
            tot = (English[i] + Maths[i] + Science[i]);
            avg = tot / 3;
          
        }
        // Print the average marks secured by each student
        System.out.println("Average marks secured by each student: " + avg);
        
        // Calculate the class averages for each subject
        engAvg = 0;
        mathAvg = 0;
        sciAvg = 0;
        for (int i = 0; i < 40; i++) {
            engAvg += English[i];
            mathAvg += Maths[i];
            sciAvg += Science[i];
        }
        // Print the class averages for each subject
        System.out.println("Class average in English: " + (engAvg / 40));
        System.out.println("Class average in Maths: " + (mathAvg / 40));
        System.out.println("Class average in Science: " + (sciAvg / 40));

        // Close the Scanner object
        sc.close();
    }
}
