package javabean;

public class ImplementEmployee {

	public static void main(String[] args) {
		EmployeeDetails emp =new EmployeeDetails();
		//setter
		emp.setEmpNo(001);
		emp.setEmpNo(19);
		emp.setSalary(10000);
		emp.setEmpName("Arbaz Khan");
		emp.setAddress("Goregaon East");
		
		//getter
		System.out.println("Employee Number is : "+emp.getEmpNo());
		System.out.println("employee Salary is :"+emp.getSalary());
		System.out.println("Employee Address is : "+emp.getAddress());
		System.out.println("Employee Name is "+emp.getEmpName());
		
		
	}

}
