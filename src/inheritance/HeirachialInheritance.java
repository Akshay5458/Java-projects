package inheritance;

class Animal{
	public void animalDetails()
	{
		System.out.println("ANIMALSS");
	}
}

class Dogs extends Animal
{
	public void dog() 
	{
		System.out.println("DOG IS AN DOMESTIC ANIMAL");
	}
}

class Tiger extends Animal
{
	public void tiger()
	{
		System.out.println("TIGER IS AN WILD ANIMAL");
	}
}
public class HeirachialInheritance {

	public static void main(String[] args) {
		
		Tiger ob=new Tiger();
		Dogs ob1=new Dogs();
		ob.tiger();
		ob.animalDetails();
		ob1.dog();
		ob1.animalDetails();
		

	}

}
