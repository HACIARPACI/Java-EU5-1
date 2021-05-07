package lab2;

import java.util.Scanner;

public class soru5 {

	public static void main(String[] args) {

	Scanner scan= new Scanner(System.in);
	System.out.println("enter the charge for the meal");
		double charge=scan.nextDouble();
		
		charge(100);
		
		
	}
     public static void charge(double charge) {
			
			double tax= charge*6.75/100;
			double tip= (charge+tax)*0.2;
			double totalbill=charge+tax+tip;
			System.out.println("charge:"+charge+ " tax : "+ tax+ " tip amount "+tip+" total bill"+totalbill);
}
}