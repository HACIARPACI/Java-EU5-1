package Day_18ReadingUserInput;

import java.util.Scanner;


public class userInput3 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter first number");
		int i1=scan.nextInt();
		
		System.out.println("enter second number");
		int num2= scan.nextInt();
		
		scan.nextLine();                       //scan.nextLine ekle yoksa alt satýra atlýyor
		
		System.out.println("enter a String");    // bstrign den önce int felan girilecekse
		String str= scan.nextLine();             //scan.nextLine ekle yoksa alt satýra atlýyor
		
		System.out.println("output:" +i1+":"+num2+":"+str);
		
		
		
		
	}

	
}
