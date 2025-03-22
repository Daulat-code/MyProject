package practic;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// initializing static fields by accessing them by using class name common to all objects.
		BankAccount2.bankName="indian oversis bank ";
		BankAccount2.branchName="Bichpuri";
		BankAccount2.ifsc="IOB0007269";
		System.out.println("static fields are initialized");
		
		// Creating instances for Dk and BSK objects
		BankAccount2 acc1 = new BankAccount2();
		BankAccount2 acc2 = new BankAccount2();
		System.out.println("instances are created for DK and BK objects");
		
		// initializing acc1 instance with BK object values
		acc1.accNum =123456;
		acc1.accHName = "BSK";
		acc1.balance = 5000;
		System.out.println("acc1 instance is initialized with BK value \n");
				System.out.println("Enter Amount You Want To Deposit\n");
				double amount = sc.nextDouble();
		acc1.deposit(amount);
		acc1.display();
		
		
		

	}

}
