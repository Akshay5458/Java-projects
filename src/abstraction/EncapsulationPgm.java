package abstraction;

class Employee{
	
	private String empname;
	private String empdesignation;
	private int empid;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}

public class EncapsulationPgm {

	public static void main(String[] args) {
		Employee ob=new Employee();
		ob.setEmpname("Antony");
		ob.setEmpid(007);
		ob.setEmpdesignation("Smuggler");
		System.out.println(ob.getEmpname());
		System.out.println(ob.getEmpid());
		System.out.println(ob.getEmpdesignation());

		
	}

}
