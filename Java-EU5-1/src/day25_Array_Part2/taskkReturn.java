package day25_Array_Part2;

import java.util.Scanner;

public class taskkReturn {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	double[]Rainfall=new double[12];	
	String[] months= {"January:", "February:", "March:", "Apr:", "May:", "Jun:", "July:", "August:","Sep:","Oct:","Nov:","Dec:"};
	 totalRainfallYear();
	System.out.println("please enter the rainfall for montsa");
	 for (int i = 0; i < Rainfall.length; i++) {
	//	 System.out.println(months[i]); 
	      Rainfall[i] =scan.nextDouble();
		 System.out.println(months[i]+Rainfall[i]);
		 
		 
	 }		
	 } 
	public static void totalRainfallYear() {
		double total=0; 
	 for (int i = 0; i < 12; i++) {
		
		total+=i;
		System.out.println(total);
	}
	 
	 
}
}