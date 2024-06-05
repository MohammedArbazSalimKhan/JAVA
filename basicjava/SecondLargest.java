package basicjava;
public class SecondLargest {

  public static int findSecondLargest(int num1, int num2, int num3) {
    // Find the largest number
    int largest = num1;
    if (num2 > largest) {
      largest = num2;
    }
    if (num3 > largest) {
      largest = num3;
    }

    // Check for second largest (excluding the maximum)
    if (num1 != largest && num1 > num2) {
      return num1;
    } else if (num2 != largest && num2 > num3) {
      return num2;
    } else if (num3 != largest) {
      return num3;
    }

    // If all numbers are equal or none are larger than the maximum, return -1 (or any value to indicate no second largest)
    return -1;
  }

  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 15;
    int num3 = 5;

    int secondLargest = findSecondLargest(num1, num2, num3);

    if (secondLargest != -1) {
      System.out.println("The second largest number is: " + secondLargest);
    } else {
      System.out.println("All numbers are equal, or none are larger than the maximum.");
    }
  }
}
