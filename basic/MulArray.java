package basic;
import java.util.Scanner;

public class MulArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element of the Array");
		int[][] a=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j < 3;j++ ) {
				a[i][j] =sc.nextInt();
				
			}
			
		}
		System.out.println("Enter the Element of the Second Array");
		int[][] b=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j < 3;j++ ) {
				b[i][j] =sc.nextInt();
				
			}
			
		}
	int[][] c=new int[3][3];
	
		for (int i=0;i <a.length;i++) {
			for(int j=0; j<a.length;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
					
		}
		for (int i=0;i<c.length;i++) {
			for(int j=0; j<c.length;i++) {
				
				for(int k=0;k<c.length;k++) {
					c[i][j]=a[i][j]*b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
