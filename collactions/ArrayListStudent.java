package collactions;

import java.util.ArrayList;

public class ArrayListStudent {

	public static void main(String[] args) {
		ArrayList<Student> std=new ArrayList<Student>();
		Student s1=new Student(1,"Akash",123,'A');
		Student s2=new Student(2,"Abhishek",120,'A');
		Student s3=new Student(3,"Raj",100,'B');
		Student s4=new Student(4,"Shiv",99,'B');
		Student s5=new Student(5,"Dhruv",80,'C');
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		std.add(s5);
		for(Student s:std)
			System.out.println(s);
				}


	

}
