package inheritance;

public class Employee {
	int emp_Id;
	String emp_Name;
	Address add;//aggregation create an object of other class and use it here
	public Employee(int emp_Id, String emp_Name, Address add) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.add = add;
	}
	
	public void display()
	{
		System.out.println("Emp_Id"+emp_Id+"Emp_name"+emp_Name);
		System.out.println("Address is  ");
		System.out.println(add.house_No+"\t"+add.house_Name+"\t"+add.city+"\t"+add.state+"\t"+add.country);
	}

	public static void main(String[] args) {
		Address a1=new Address("RajBhavan",12, "Mumbai","Maharastra","India");//constructor for Address
		Address a2=new Address("Brundhava",13,"Mumbai","Maharastra","India");
		Employee emp1=new Employee(101,"Chetan",a1);//constructor input for employee
		Employee emp2=new Employee(102,"Sachin",a2);
		emp1.display();
		emp2.display();
		
		
		
	}

}