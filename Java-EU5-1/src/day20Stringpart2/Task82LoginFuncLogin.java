package day20Stringpart2;

import java.util.Scanner;

public class Task82LoginFuncLogin {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);

		String userNameInSystem = "Mike";
		String passwordInSystem = "123";
		
		System.out.print("Enter your username:");
		String userName = sc.nextLine(); //line koymazsan alt satýra gecmez
		
		System.out.print("Enter your password:");
		String password = sc.nextLine();
		
		
	/*	if(userName.equals("") && password.equals("")) {
			System.out.println("Username and password fields can not be empty");
		}else if(userName.equals("") && !password.equals("")){
			System.out.println("Username can not be empty");
		}else if(!userName.equals("") && password.equals("")) {
			System.out.println("Password can not be empty");
		}else if(!userName.equals(userNameInSystem) || ! password.equals(passwordInSystem)) {
			System.out.println("Username or password not valid,please verify");
		}else if(userName.equals(userNameInSystem) && password.equals(passwordInSystem)) {
			System.out.println("User logged in  successfully");
		}*/
			
		
		if( userName.equals("")&&password.equals("")) {   // ! kullanýmý önemli
			System.out.println("cant  empty");
		}else if(userName.equals("")&&!password.equals("")) {
			
			System.out.println("username cant be empty");
		}else if(!userName.equals("")&&password.equals("")) {
			System.out.println("password cant be empyt");
		}else if(!userName.equals(userNameInSystem)||!password.equals(passwordInSystem)) {
			System.out.println("one or two it not valid");
			
		}else if(userName.equals(userNameInSystem)&&password.equals(passwordInSystem)) {
			System.out.println("log in suvvesfully");
			
		}
		
		
		
	}

}
