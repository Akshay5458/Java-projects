package inheritance;

class Birds{
	public void birdDetails()
	{
		System.out.println("BIRD DETAILS");
	}
}
class Hen extends Birds
{
	public void henMethod() {
		System.out.println("HEN DETAILS");
	}
}

class Eagle extends Hen
{
	public void eagleMthd() {
		System.out.println("EAGLE FIGHTER");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {

		Eagle ob=new Eagle();
		ob.birdDetails();
		ob.henMethod();
		ob.eagleMthd();
	}

}
