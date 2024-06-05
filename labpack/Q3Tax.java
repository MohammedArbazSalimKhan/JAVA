// 3. Write a program in Java to accept the name of an employee and his/her annual income. Pass the name and the annual income. Displays the name of the employee and the income tax as per the given tariff:
package labpack;
import java.util.Scanner; // importing the Scanner class

public class Q3Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Following Details:");
        //taking details as input from the customer
        System.out.println("Please Enter your Name:");
        String name = scanner.next();
        System.out.println("Please Enter your Annual Salary:");
        int salary = scanner.nextInt();
        
        double exincome = salary - 250000;  //exceed income
        double tax = 0;
        // checking condition of tex structure
        if (salary <= 250000) {
            System.out.println("No Tax");
        } else if (salary >= 250001 && salary <= 500000) {
            tax = 0.10 * exincome; // calculating the  total tax 
            System.out.println("Tax (10% of the income exceeding ₹2,50,000): ₹" + tax);
        } else if (salary >= 500001 && salary <= 1000000) {
            tax = 30000 + (0.20 * exincome); // calculating the  total tax
            System.out.println("Tax (₹30,000 + 20% of the amount exceeding ₹5,00,000): ₹" + tax);
        } else if (salary > 1000000) {
            tax = 50000 + (0.30 * exincome); // calculating the  total tax
            System.out.println("Tax (₹50,000 + 30% of the amount exceeding ₹10,00,000): ₹" + tax);
        }
        
        double netSalary = salary - tax;
        //printing Customer Details and Customer Net salary
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Income: ₹" + salary);
        System.out.println("Employee Net Income: ₹" + netSalary);
    }
}
