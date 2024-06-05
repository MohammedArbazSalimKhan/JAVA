package javabean;

public class Student {
	private int rollNo;
	private String name,course,emailid;
	private long phoneNo;
	private char division;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public char getDivision() {
		return division;
	}
	public void setDivision(char division) {
		this.division = division;
	}
	public Student(int rollNo, String name, String course, String emailid, long phoneNo, char division) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.emailid = emailid;
		this.phoneNo = phoneNo;
		this.division = division;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", emailid=" + emailid
				+ ", phoneNo=" + phoneNo + ", division=" + division + "]";
	}
	
	

}
