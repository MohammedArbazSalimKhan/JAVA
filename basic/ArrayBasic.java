package basic;
import java.util.Scanner;

public class ArrayBasic {
	int array[];
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Element :");
		int array[] =new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		
		for(int i=0;i<array.length;i++) {
		//	array[i]=sc.nextInt();
			System.out.print(" "+array[i]);
		}
	System.out.println("\n"+array[1]);
	
	}

}

