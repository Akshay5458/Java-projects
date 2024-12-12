package methods;

import java.util.Scanner;

public class VwlsCount {

	public static void main(String[] args) {


		System.out.println("Enter a word");
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		VwlsCount ob=new VwlsCount();
		System.out.println(ob.vow(s));
		
		
	}
	public int vow(String s)
	{
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				count++;
		}
		return count;
	}

}
