package day28Part5LabCont;

import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {

		
	System.out.println(Arrays.toString(fizzyArray(10)));	
		
		
	}

	public static int []fizzyArray(int number){
		int[]newArray=new int[number];
		for (int i = 0; i < number; i++) {
			newArray[i]=i;
		}
		return newArray;
		
		
	}
}
