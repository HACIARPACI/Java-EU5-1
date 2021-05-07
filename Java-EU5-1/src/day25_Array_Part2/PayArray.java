package day25_Array_Part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
// this prog stores in an array the hours worked forby 5 employees
// who all makethe same hourlydisplay their grossss pay

		Scanner scan =new Scanner(System.in);
		
		final int employees=5;
		double payRate;
		double grossPay;
	//get the hour worked by each employee	
		int [] hours= new int[employees];
		System.out.println("please enter the work hours of"+employees+" hourly wage");
		for (int i = 0; i < hours.length; i++) {
			hours[i]=scan.nextInt();
			
		} 
		// get the hourly rate
		System.out.println("enter the rate for each employee"); 
		payRate=scan.nextDouble();
		
		// display the each employees gross pay
		
		for (int i = 0; i < hours.length; i++) {
			grossPay=hours[i]*payRate;
			System.out.println("employee # "+ (i+1)+" :$ "+grossPay);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
