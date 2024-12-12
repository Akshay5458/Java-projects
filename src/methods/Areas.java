package methods;

import java.awt.geom.Area;
import java.util.Scanner;

public class Areas {

	public static void main(String[] args)
	{ 
		Areas ob=new Areas();
		System.out.println("enter length of rectangle or side of square or radius of circle");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		System.out.println("enter breadth of rectangle");
		int b=sc.nextInt();
		ob.rec(l, b);
		ob.sqre(l);
		ob.circle(l);
		System.out.println("Enter the base of triangale");
		int ba=sc.nextInt();
		System.out.println("Enter the height of triangle");
		int h=sc.nextInt();
		ob.Triangle(ba, h);
			

		
	}
	//area of rectangle
	public void rec(int l,int b)
	{
		int area=l*b;
		System.out.println("Area of rectangle : " +area);
		
	}
	
	//Area of square
	public void sqre(int l)
	{
		int area=l*l;
		System.out.println("Area of square : " +area);
		
	}
	
	//Area of circle
	public void circle(int l)
	{
		double area=3.14*l*l;
		System.out.println("Area of circle : " +area);
	}
	
	//Area of triangle
	public void Triangle(int ba,int h)
	{
		double area=0.5*ba*h;
		System.out.println("Area of triangle :" +area);
	}
	
	
	

}
