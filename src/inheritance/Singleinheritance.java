package inheritance;

import polymorphism.AccsMd;

class Cars
{
	public void displayMthd()
	{
		System.out.println("CAR DETAILS");

	}
}

class Bmw extends Cars
{
	public void bmwdetails()
	{
		System.out.println("BMW M5");
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		
		Bmw ob1=new Bmw();
		ob1.displayMthd();
		ob1.bmwdetails();
		
		// Access modifier called from polymorphism package
		AccsMd ob=new AccsMd();
		ob.d=10; // Public Access modifier


		
	}

}
