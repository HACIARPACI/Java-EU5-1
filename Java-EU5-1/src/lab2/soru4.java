package lab2;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);	
		System.out.println("number of males");
		double numMan=scan.nextInt();
		System.out.println("number of females");
		double numFem=scan.nextInt();
		double sum= numMan+numFem;
		 double perMan=(numMan/sum)*100 ;
		double perFem=(numFem/sum)*100;
		System.out.println("percentages of male is :"+ perMan);
		System.out.println("percentages of female is :"+ perFem);
	}

}
