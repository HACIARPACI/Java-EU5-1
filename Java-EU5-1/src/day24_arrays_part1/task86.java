package day24_arrays_part1;

import java.util.Scanner;

public class task86 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String []month=new String[12];
		month[0]="jan";
		month[1]="feb";
		month[2]="mar";
		month[3]="apr";
		month[4]="may";
		month[5]="jun";
		month[6]="jul";
		month[7]="aug";
		month[8]="sept";
		month[9]="oct";
		month[10]="nov";
		month[11]="dec";

		System.out.println("enter your month index number");
		int index=scan.nextInt();
		System.out.println("the month is :"+month[index-1]);
	//	System.out.println(month);//  show the adress :) [Ljava.lang.String;@38082d64
	}

}
