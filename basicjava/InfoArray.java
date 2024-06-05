/*wapt to create an array of rollno, name, mark1, mark2, mark3 , total and average
of 10 students and display their information accodingly*/

package basicjava;
import java.util.Scanner;

public class InfoArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Length of the Array Roll no.");
		int[] roll=new int[3];
		String[] name=new String[3];
		int[] marks1=new int[3];
		int[] marks2=new int[3];
		int[] marks3=new int[3];
		int[] total=new int[3];
		int[] average=new int[3];
		
		for (int i=0;i<3;i++) {
			System.out.println("Roll number of the student"+(i+1)+" :");
			roll[i]=sc.nextInt();
			System.out.println("Name of the student"+(i+1)+" :");
			name[i]=sc.next();
			System.out.println("marks 1 of the student"+(i+1)+" :");
			marks1[i]=sc.nextInt();
			System.out.println("marks 2 of the student"+(i+1)+" :");
			marks2[i]=sc.nextInt();
			System.out.println("marks 3 of the student"+(i+1)+" :");
			marks3[i]=sc.nextInt();
			total[i]=marks1[i]+marks2[i]+marks3[i];
			average[i]=total[i] / 3;
			
		}
		System.out.println("\n roll \n anme \n marks1 \nmarks2 \n marks3 \n total \n average");
		for(int i=0;i<3;i++) {
			System.out.println(roll[i] + "\t\t" + name[i] + "\t"+ marks1[i] +marks2[i] + marks3[i] + total[i] +average[i]);
		}
		
		
	}

}
