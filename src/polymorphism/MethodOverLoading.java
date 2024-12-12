package polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) 
	{
		MethodOverLoading ob=new MethodOverLoading(); // second koduthekkane (methodoverloading) constructor enn parayum
		ob.add();
		ob.add(21, 31);
		ob.add(31, 21.1);
		ob.add(21.1, 12);
		
	}
	public void add()
	{
		int a=10,b=21,c;
		c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
}