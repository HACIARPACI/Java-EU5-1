package day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class task88  {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		Random rn=new Random();
		int price=0;
		String cars[]=new String[7];
		cars[0]="honda";
		cars[1]="toyota";
		cars[2]="nissan";
		cars[3]="bmw";
		cars[4]="merco";
		cars[5]="porsch";
		cars[6]="ferro";
		System.out.print("select car index number");
		int index=scan.nextInt();
		String selectedCar=cars[index];
		
		switch(selectedCar) {
		case"honda": case "toyota": case "nissan":
			price=rn.nextInt((40000-20000)+1)+20000;
			break;
		case"bmw": case "merco":
			price=rn.nextInt((80000-50000)+1)+50000;
			break;
		 case "porsch": case "ferro":
			price=rn.nextInt((150000-100000)+1)+100000;
			break;
		default:
			System.out.println("invalid car");
		
	}
System.out.println("selected car price is :"+price);











}
}