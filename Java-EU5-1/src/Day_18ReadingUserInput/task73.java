package Day_18ReadingUserInput;

import java.util.Scanner;

public class task73 {

	public static void main(String[] args) {
		
		int userInput=0;
		int secretNumber=8;
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number between 1-20");
		do {
		
			userInput=scan.nextInt();
			if(userInput<secretNumber) {
				System.out.println("enret a bigger number");
			}else if(userInput>secretNumber) {
				System.out.println("enter a smaller number");
			}else {
				System.out.println("you got it!!!");
			}
		
		
	}while(userInput != secretNumber);

	}	
	
}
