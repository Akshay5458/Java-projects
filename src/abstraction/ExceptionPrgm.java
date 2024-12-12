package abstraction;

import java.io.FileInputStream;

public class ExceptionPrgm {

	public static void main(String[] args) {

		try {
			int a=10;
			int b=0;
			int c=a/b;
		}
		catch(Exception e)
		{
		 System.out.println(e.getMessage());	
		}
		System.out.println("hi hello");
		
		try {
			String s=null;
			System.out.println(s.length());
			
		}
		catch(Exception e1)
		{
			System.out.println("error");
		}
		
		try {
			int[] arr=new int[2];         
		}
		catch(Exception e2)
		{
			System.out.println(e2.getMessage());
		}
	}

}
