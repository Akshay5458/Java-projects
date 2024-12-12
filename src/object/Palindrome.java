package object;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0,rem,temp=a;
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;

		}
		if(temp==rev)
		{
			System.out.println("the given number is palindrome");
			
		}
		else
		{
			System.out.println("not palindrome number");
		}

	}

}
  