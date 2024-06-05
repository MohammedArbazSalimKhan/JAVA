package javabean;

public class EmployeeDetails {
	private int empNo,salary;
	private String empName,address;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public EmployeeDetails(int empNo, int salary, String empName, String address) {
		super();
		this.empNo = empNo;
		this.salary = salary;
		this.empName = empName;
		this.address = address;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
