package array;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {

		int[] arr=new int[3];
		System.out.println("enter the numbers");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=2;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=2;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
