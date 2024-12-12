package object;

import java.util.Scanner;

public class Addobj {

	public static void main(String[] args) {
System.out.println("Enter two numbers:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=a+b;
System.out.println("sum of the given numbers= "+c);
	}

}
