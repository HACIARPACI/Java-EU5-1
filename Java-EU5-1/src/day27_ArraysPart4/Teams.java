package day27_ArraysPart4;

import java.util.Arrays;

public class Teams {

	public static void main(String[] args) {

	//	String[][]teams=new String[2][4];
		/*
		teams[0][0]="MÝke";
		teams[0][1]="Tony";
		teams[0][2]="Smith";
		teams[0][3]="Evan";
		
		teams[1][0]="David";
		teams[1][1]="Emmy";
		teams[1][2]="John";
		teams[1][3]="Ryan";
		
		System.out.println("firsy oplayer of first team");
		System.out.println(teams[0][0]);*/
		
		String [][]teams= {{"Mike","Tony","Smith","Evan"},{"David","Emmy","John","Ryan"}};
		
		System.out.println("number of teams"+teams.length);
		System.out.println("peaople in the first team: "+teams[0].length);
		System.out.println(Arrays.toString(teams[1]));
		System.out.println("people in the second team is :"+teams[1].length);
		System.out.println(teams[0][2].length());
		
		
	}

}
