package week5;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
Scanner scan =new Scanner(System.in);


	while(true) {
	System.out.println("enter your first nuýmber");
	int f=scan.nextInt();	
	
	System.out.println("enter your second nuýmber");
	int s=scan.nextInt();
	
	System.out.println("enter a math operator");
	char operator =scan.next().charAt(0);
	
	switch(operator) {
	case '-': System.out.println(" sub: "+(f-s));
		break;
	case '+': System.out.println(" add: "+(f+s));
		break;
	case '*': System.out.println("mult: "+(f*s));
		break;	
	case '/': System.out.println(" div: "+(f/s));
	break;
		default:
			System.out.println("invalid operator"); 
		
	
	}
	
//	System.out.println("sum :"+(f+s));
	scan.nextLine();
	
	System.out.println("do you want to continue");			
	String a=scan.nextLine();	
	
	while(!(a.equals("yes")||a.equals("no"))) { //yes yada no dþýnda bieþy ayzzlýrsa invalid please re-enter yqazmasý için
		System.out.println("ýnvalid entry, please re-enter");
		a=scan.nextLine().toLowerCase();
	}
		
	if (a.equals("no")) {
		System.out.println("test comleted");
		break;
	}
						
	}

	
	}	
}
/*	write a program that ill ask user to enter two numbers and calculates the sum of those two numbers. then it asks the user if he/she wants to continue

if the answer is yes, repeat the whole process again
if the answer is no, only return the addition

but WHILE the answer is neither yes nor no, the the program should repeatedly ask the user re-enter*/
