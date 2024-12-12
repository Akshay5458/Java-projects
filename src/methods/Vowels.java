package methods;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		System.out.println("Enter a word : ");
		Scanner sc=new Scanner (System.in); //new used for new memmory allocation
		String s=sc.next().toLowerCase();
		Vowels ob=new Vowels();
		ob.vow(s);
		
		
	}
	public void vow(String s)
	{
		int count=0;
		char[] c=s.toCharArray();  
		for(char ele:c)
		{
			
			if(ele=='a'||ele=='e'||ele=='i'||ele=='o'||ele=='u')
			{
			count++;	
			}
		}
		System.out.println("Count of vowels in the word = " +count);
		
		
	}

}
