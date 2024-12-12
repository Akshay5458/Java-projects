package akwrk;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {

		System.out.println("enter the count of numbers ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("ENter numbers:");
		int countp=0;
		int countn=0;
		int zero=0;
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();

		if(num>0)
		{
			countp++;
		}
		else if(num<0)
		{
			countn++;
		}
		else
		{
			zero++;
		}
		}
		System.out.println("no of positive numbers :" +countp);
		System.out.println("no of negative numbers:" +countn);
		System.out.println("no of negative numbers:" +zero);


}
}



