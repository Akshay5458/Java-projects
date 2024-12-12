package akwrk;

import java.util.Scanner;

public class EvenString {

	public static void main(String[] args) {
		
		System.out.println("Enter some Words:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] sp=s.split(" ");
		for(String e:sp)
		{
			
			if(e.length()%2==0)
			{
				System.out.println(e);
			}
			
		}
	}

}
