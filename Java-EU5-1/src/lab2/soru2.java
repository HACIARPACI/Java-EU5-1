package lab2;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		
		double caloriesPerCook=300/(40/10);
		
		Scanner  scan= new Scanner(System.in);
		System.out.println("enter the number of cookies that you ate");
		int numCookies=scan.nextInt();
		double  totalCalories=caloriesPerCook*numCookies;
		System.out.println(totalCalories);
	}

}
