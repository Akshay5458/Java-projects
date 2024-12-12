package constructor;

public class Employee {

	public static void main(String[] args) {
		
		Employee emp=new Employee(1,"akshay");
		Employee ob=new Employee(2,"ramees");
		ob.display();
		

		
	}
	int empid;
	String empname;
	public Employee(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	public void display()
	{
		System.out.println("Employee id =" +empid);
		System.out.println("Employee name =" +empname);

	}

}
