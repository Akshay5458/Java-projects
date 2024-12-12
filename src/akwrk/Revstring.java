package akwrk;

import java.util.Scanner;

public class Revstring {

	public static void main(String[] args) {

		System.out.println("Enter the String: ");
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		String[] sp=s.split(" ");
		for(int i=sp.length-1;i>=0;i--)
		{
				System.out.print(sp[i]+" ");

		}
	
		
	}

}
