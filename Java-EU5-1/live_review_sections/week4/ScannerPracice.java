package week4;

import java.util.Scanner;

public class ScannerPracice {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		int greatest =-546546154;
		int min=654654654;
		for (int i = 1; i <=5; i++) {
			System.out.println("enter number");
			int num =scan.nextInt();
			 if (num>greatest){
				 greatest=num;
			 }
			 if(num < min) { 
				 min = num;
			 }
		} 	
		
		 System.out.println("greatestis :" +greatest);
		System.out.println("min is: "+min);
	}

}
