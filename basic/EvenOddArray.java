// WAP to input array of 10 elements and find the even number sum and odd number sum
package basic;
import java.util.Scanner;

public class EvenOddArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// to receive input from the user
        System.out.println("Enter the elements of the Array:");
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) // to create index
        {
            a[i] = sc.nextInt(); // Accept from the user
        }
        System.out.println("The array elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nThe reverse of the array:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        int evenSum = 0;
        int oddSum = 0;
        int divthree=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenSum += a[i];
            }
            if (a[i] % 3 == 0) {
            	divthree += a[i];
            }
            else {
                oddSum += a[i];
            }
        }
        System.out.println("\nSum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        // for printing sum of element divisible by 2 and 3
        System.out.println("Sum of numbers divisible by 2 : " + evenSum);
        System.out.println("Sum of numbers divisible by 3 : " + divthree);
    }
}
