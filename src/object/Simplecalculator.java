package object;

import java.util.Scanner;

public class Simplecalculator {

	public static void main(String[] args) {

		int a,b,c,d,e;
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=sc.nextInt();
		
		System.out.println("enter your choice \n 1.for addition \n 2.substraction \n 3.multiplication \n 4.divison \n 5.modulus");
		int f=sc.nextInt();
		a=n+i;
		b=n-i;
		c=n*i;
		d=n/i;
		e=n%i;
		switch(f)
		{
		case 1: System.out.println(+a);
		break;
		case 2: System.out.println(+b);
		break;
		case 3: System.out.println(+c);
		break;
		case 4: System.out.println(+d);
		break;
		case 5: System.out.println(+e);
		break;
	default:System.out.println("invalid expression");
		}
		
	}

}
