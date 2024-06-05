package collactions;

public class Student {
	private int rollNo;
	private String name;
	private int marks;
	private char grade;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Student(int rollNo, String name, int marks, char grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}