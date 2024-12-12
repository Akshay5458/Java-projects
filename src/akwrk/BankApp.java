package akwrk;

import java.util.Scanner;

interface bank{
	public void accountDetails();
	public void balance();
	public void deposit();
	public void withdraw();
}
class Hdfc implements bank{
	static String bankname="HDFC";
	String name="Antony das";
	int balance=100000;
	int updatebalance;
	int upbalance;
	Scanner sc=new Scanner(System.in);

	@Override
	public void accountDetails() {

		System.out.println("Enter your account no: ");
		int accno=sc.nextInt();
		System.out.println("Your account details :" + "\n" + accno + "\n" + name + "\n" + bankname);

	}

	@Override
	public void balance() {

		System.out.println("Your account balance = " + balance);

	}

	@Override
	public void deposit() {

		System.out.println("Enter the amount to deposit:");
		int amount=sc.nextInt();
		updatebalance=balance+amount;
		System.out.println("your updated balance is :  " + updatebalance );
	}

	@Override
	public void withdraw() {


		System.out.println("Enter the amount to withdraw :");
		int amount=sc.nextInt();
		upbalance=updatebalance-amount;
		System.out.println("your updated balance = " + upbalance);

	}
	
}
public class BankApp {

	public static void main(String[] args) {
		
		Hdfc ob=new Hdfc();
		ob.accountDetails();
		ob.balance();
		ob.deposit();
		ob.withdraw();


	}

}
