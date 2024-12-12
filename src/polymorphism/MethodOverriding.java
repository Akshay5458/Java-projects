package polymorphism;

class Parent{
	
	public void job() {
		System.out.println("Engineer");
		
	}
	public void phone()
	{
		System.out.println("Iphone");
	}
}
class Child extends Parent{

	@Override
	public void job() {
System.out.println("doctor");
		super.job();  //super keyword is used to call instance parentclass method without create object
	}

	@Override
	public void phone() {

		System.out.println("POCO");
		super.phone();
	}
	
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		Child ob1=new Child();
		ob1.job();
		ob1.phone();
		
		// Access modifiers called 
		
		AccsMd ob=new AccsMd();
		ob.b=20; // Default Access Modifier 
		ob.c=30; // Protected Access modifier
		ob.d=40; // Public Access modifier

		
	}

}
