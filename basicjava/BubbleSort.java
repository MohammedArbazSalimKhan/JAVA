package basicjava;
import java.util.Scanner;


import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int temp;

        // Input the array elements
        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform bubble sort
        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
