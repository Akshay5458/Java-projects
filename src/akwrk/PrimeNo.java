package akwrk;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				System.out.print("Enter a positive integer: ");
				int n = sc.nextInt();

				if (n <= 1)
				{
					System.out.println(n + " is not a prime number.");
				} 
				else
				{
					int i;
					for (i = 2; i < n; i++) {
						if (n % i == 0) {
							System.out.println(n + " is not a prime number.");
							break;
						}
					}
					if (i == n) 
					{
						System.out.println(n + " is a prime number.");
					}
				}
			}
	}

