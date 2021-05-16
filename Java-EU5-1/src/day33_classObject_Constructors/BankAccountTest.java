package day33_classObject_Constructors;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		String input;
		System.out.println("whats your statrtin balance");
		input=scan.next();
		
		BankAccount account= new BankAccount(input);
		System.out.println("how much  were u paid this month");
		input=scan.next();
		account.deposit(input);
		
		System.out.println("your pay has been deposited . your current balance is :"+ account.getBalance());
		
		
	}

}
