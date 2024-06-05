package discount;

import java.util.Scanner;

public class DiscountAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer Name:");
        String name = sc.nextLine();
        System.out.println("Enter the Customer Address:");
        String address = sc.nextLine();
        System.out.println("Enter the Amount of Purchase:");
        int amount = sc.nextInt();

        System.out.println("Enter the Type of Purchase (1 for Laptop L, 2 for Desktop D):");
        int option = sc.nextInt();

        double discountRate = 0.0;
        switch (option) {
            case 1: // Laptop
                if (amount >= 0 && amount <= 25000) {
                    discountRate = 0.0;
                } else if (amount >= 25001 && amount <= 57000) {
                    discountRate = 5.0;
                } else if (amount >= 57001 && amount <= 100000) {
                    discountRate = 7.5;
                } else if (amount > 100000) {
                    discountRate = 10.0;
                }
                break;

            case 2: // Desktop
                if (amount >= 0 && amount <= 25000) {
                    discountRate = 5.0;
                } else if (amount >= 25001 && amount <= 57000) {
                    discountRate = 7.5;
                } else if (amount >= 57001 && amount <= 100000) {
                    discountRate = 10.0;
                } else if (amount > 100000) {
                    discountRate = 15.0;
                }
                break;

            default:
                System.out.println("Invalid Option");
                sc.close();
                return;
        }

        double discount = (discountRate / 100) * amount;
        double netAmount = amount - discount;

        System.out.println("Customer Name: " + name);
        System.out.println("Customer Address: " + address);
        System.out.println("Amount of Purchase: " + amount);
        System.out.println("Type of Purchase: " + (option == 1 ? "Laptop" : "Desktop"));
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: " + discount);
        System.out.println("Net Amount to be Paid: " + netAmount);

        sc.close(); // Closing the scanner
    }
}


