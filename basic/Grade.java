package basic;
import java.util.Scanner;
public class Grade{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Plz Enter your 5 subjects Marks : ");
		int Hindi=scanner.nextInt();
		int English=scanner.nextInt();
		int Maths=scanner.nextInt();
		int Science=scanner.nextInt();
		int History=scanner.nextInt();
		double avg;
		char grade;
		int total;
		total=Hindi+English+Maths+Science+History;
		avg=(Hindi+English+Maths+Science+History)/5 ;
		if (avg >= 90 && avg <=100) {
			grade='A';
		}
		else if(avg >= 80 && avg <=90) {
			grade='B';
		}
		else if(avg >= 70 && avg <=80) {
			grade='C';
		}
		else  {
			grade='D';
		}
		
		System.out.println("total : "+total);
		System.out.println("Avg : "+avg);
		System.out.println("Your Grade Is : "+grade);
		

	}
}