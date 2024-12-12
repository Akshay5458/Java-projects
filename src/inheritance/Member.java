package inheritance;


public class Member {

	public static void main(String[] args) {

		System.out.println("Babu,18,2255,DAS&Co,50000");
		Member ob=new Member();
		ob.display();
		Member ob1=new Member();
				
	}

	public void display()
	{
		System.out.println("Babu,18,2255,DAS&Co,50000");
	}
	
	class Employee extends Member
	{
		public void memberdetails()
		{
			System.out.println("das,Employee,emp");
		}
	}
	class Manager extends Member{
		public void managerDetails()
		{
			System.out.println("ANtony,Manager,Management");
		}
	}
}
