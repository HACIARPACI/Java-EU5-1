package day25_Array_Part2;

import java.util.Scanner;

public class taskkReturn {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	double[]Rainfall=new double[12];	
	String[] months= {"January:", "February:", "March:", "Apr:",
			"May:", "Jun:", "July:", "August:","Sep:","Oct:","Nov:","Dec:"};

	System.out.println("please enter the rainfall for months");
	 for (int i = 0; i < Rainfall.length; i++) {

		 
		 Rainfall[i] =scan.nextDouble();
		 System.out.println(months[i]+Rainfall[i]);
		 
		 
	 }		
	 } 

}
