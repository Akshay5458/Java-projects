package object;

public class Employee {
	int empid;
	String empname;
	String empdsgn;
	

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		System.out.println(emp1.empid=101);
		System.out.println(emp1.empname="Ardra");
		System.out.println(emp1.empdsgn="Test engineer");
		
		Employee emp2=new Employee();
		System.out.println(emp2.empid=102);
		System.out.println(emp2.empname="Antony");
		System.out.println(emp2.empdsgn="Quality analist");

		Employee emp3=new Employee();
		System.out.println(emp3.empid=103);
		System.out.println(emp3.empname="abii");
		System.out.println(emp3.empdsgn="qc engineer");
	}

}
