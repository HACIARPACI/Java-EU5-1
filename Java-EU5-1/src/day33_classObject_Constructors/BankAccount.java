package day33_classObject_Constructors;

public class BankAccount {
	// instance variable
	double balance;
	public BankAccount() {
		balance=0.0;	
	}
	// this cons. sets the starting balance to the value passes as an arguement
	public BankAccount(double startBalance) {
		
		balance=startBalance;	
	}
	// This cons. sets the startng balance to the value in the string arguement
	public BankAccount(String str) {
		
	balance= Double.parseDouble(str);
	
	}
	// Deposit method makes a deposit into account
	
	public void deposit(String str) {
		
		balance=balance+Double.parseDouble(str);		
		
	}
	public double getBalance() {
		
		return balance;
	}
	
	
	
	
}
