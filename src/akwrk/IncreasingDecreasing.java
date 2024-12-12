package akwrk;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {


		System.out.println("Enter the numbers : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && b>c)
		{
				System.out.println("the number is decreasing order");
		}
		else if(a<b && b<c)
		{

			System.out.println("the number is increasing order");
		}
		else
		{
			System.out.println("otherwise");
		}
		
		
		
	}

}
