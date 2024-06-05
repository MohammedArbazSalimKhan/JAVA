package javabean;

public class StudentImplementation {

	public static void main(String[] args) {
		Student std= new Student();
		//setter
		std.setRollNo(19);
		std.setName("Arbaz");
		std.setCourse("B.sc");
		std.setDivision('A');
		std.setPhoneNo(93726837);
		std.setEmailid("mohammedarbazsalimkhan@gmail.com");
		
		// getter
		System.out.println("Roll no is :"+std.getRollNo());
		System.out.println("Name is :"+std.getName());
		System.out.println("Course is :"+std.getCourse());
		System.out.println("Division is :"+std.getDivision());
		System.out.println("Phone number is :"+std.getPhoneNo());
		System.out.println("Email id is:"+std.getEmailid());
		
		
	}

}
