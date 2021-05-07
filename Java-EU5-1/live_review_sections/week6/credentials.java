package week6;

import java.util.Scanner;

public class credentials {

	public static void main(String[] args) {

		String EU = "Cybertek";
		String EP = "Cybertek123";

		System.out.println("----------------------------------------");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your username: ");
		String username = scan.next();

		System.out.println("Enter your password: ");
		String password = scan.next();

		if (username.equals(EU) && password.equals(EP)) { // user entered username & password are correct
			System.out.println("You logged in");

		} else { // user entered username & password are incorrect: 3 more tries

			for (int i = 1; i <= 3; i++) { // user gets three tries

			
				
				System.out.println("Username or password is incorrect!");
				System.out.println("Please re-enter your username");
				username = scan.next();

				System.out.println("Please re-enter your password");
				password = scan.next();
				
				if(username.equals(EU) && password.equals(EP)) {
					System.out.println("You logged in");
					break;
				}
				
				if(i == 3) { // if attempt already is 3 and U&P are still incorrect
					System.err.println("your account is locked, please contact with costomer service");
					System.exit(0);
				}
				
				
			}
			

		}
		
		
		scan.close();
		
		
		
	}

}
