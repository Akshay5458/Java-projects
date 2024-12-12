package array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int arraysize=sc.nextInt();
		int sum=0;
		
		System.out.println("enter the numbers:");
		int[] arr=new int[arraysize];
		for(int i=0;i<arraysize;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum of entered numbers="+sum);
		System.out.println("Average of given numbers="+sum/arraysize);
	}

}
