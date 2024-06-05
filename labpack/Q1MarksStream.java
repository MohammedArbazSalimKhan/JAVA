// 1..St. Xavier School displays a notice on the school notice board regarding admission in Std. XI for choosing different streams, according to marks obtained in English, Maths and Science in ICSE Examinations.
package labpack;
import java.util.Scanner; // importing the Scanner package

public class Q1MarksStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your subject marks:");
        // Asking marks as input from the student
        System.out.println("English:");
        int English = scanner.nextInt();
        System.out.println("Maths:");
        int Maths = scanner.nextInt();
        System.out.println("Science:");
        int Science = scanner.nextInt();

        double mymarks = (English + Maths + Science);// total of 3 subjects marks of the student
        double totalmarks = 300; // tatal marks
        double EngMath = 200;
        double percentage = (mymarks / totalmarks) * 100; // Calculating the percentage

        double perEngMaths = ((English + Maths) / EngMath) * 100;
        // applying the condition
        if (percentage >= 80) {
            System.out.println("You are eligible for PURE SCIENCE.");
        } else if (perEngMaths >= 80 && English >= 60 && Maths >= 60) {
            System.out.println("You are eligible for BIO. SCIENCE.");
        } else if (percentage >= 60) {
            System.out.println("You are eligible for COMMERCE.");
        } else {
            System.out.println("You are not eligible for any stream.");
        }
    }
}
