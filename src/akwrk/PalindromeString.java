package akwrk;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		System.out.println("Enter a word");
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		String rev="";
		int length=a.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
			
		}
		
		System.out.println(rev);
		if(rev.equalsIgnoreCase(a))
		{
		System.out.println(a +"is palindrome");
		}
		else
		{
			System.out.println(a+ "  is not palindrome");
		}

	}

}
