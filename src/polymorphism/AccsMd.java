package polymorphism;

public class AccsMd {

	private int a; //private acces modifier
	int b; // Default access modifier
	protected int c; // Protected Access Modifier
	public int d; // Public Acces Modifier
	
	public static void main(String[] args) {
		AccsMd ob=new AccsMd();
		ob.a=10;
		ob.b=21;
		ob.c=30;
		ob.d=10;


	}

}
