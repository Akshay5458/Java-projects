package abstraction;

interface CarDetails{
	public void acceleration();
	public void speedlimit();
	public void torque();
	
}

class Benz implements CarDetails{

	@Override
	public void acceleration() {
		System.out.println("benz acceleration");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("Benz speedlimit");
	}

	@Override
	public void torque() {

		System.out.println("Benz torque");
	}
	
}

public class InheritancePrgm {

	public static void main(String[] args) {
		Benz ob=new Benz();
		ob.acceleration();
		ob.speedlimit();
		ob.torque();


		
	}

}
