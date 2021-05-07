package day24_arrays_part1;

import java.util.Scanner;

public class task87 {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		String days[]=new String[7];
		days[0]="sunday";
		days[1]="monday";
		days[2]="tuesday";
		days[3]="wedday";
		days[4]="thursday";
		days[5]="friday";
		days[6]="sunday";
		System.out.println("enter the sleected day");
		int gün=scan.nextInt();
		System.out.println("today is : "+days[gün]);
		
	}

}
