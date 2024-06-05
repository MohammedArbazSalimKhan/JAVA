//wap program to input id, name and address of an emplyees and display using constructor

package constructor;
import java.util.Scanner;
import java.util.*;
public class Employee {
	int id;
	String name;
	String address;
	public Employee() {
		id=0;
		name="arbaz";
		address="goregaon";
					
	}
	
	public Employee(int id, String name, String address) {
		System.out.println("Employee id :"+id);
		System.out.println("Employee name :"+name);
		System.out.println("Employee address :"+address);
		
	}

	public static void main(String[] args) {
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Emplyee Details \n id \n Name: \n address: :");
		int id=sc.nextInt();
		String name=sc.next();
		String address=sc.next();
		Employee emp1=new Employee(id, name, address);
		
	}

}
