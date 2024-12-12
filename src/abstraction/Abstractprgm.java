package abstraction;
abstract class Cars{
	abstract public void acceleration();
	
	public void carEngine() {
		System.out.println("Engine details:");
		
	}
}

class Kia extends Cars {

	@Override
	public void acceleration() {
		System.out.println("kia acceleration");

		
	}
	
}
class Maruti extends Cars{

	@Override
	public void acceleration() {
		System.out.println("Maruti Acceleration");

	}
	
}

public class Abstractprgm {

	public static void main(String[] args) {

		Kia ob=new Kia();
		ob.acceleration();
		ob.carEngine();
		Maruti ob1=new Maruti();
		ob1.carEngine();
		ob1.acceleration();

	}

}
