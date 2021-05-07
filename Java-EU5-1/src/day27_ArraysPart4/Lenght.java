package day27_ArraysPart4;

import java.util.Arrays;

public class Lenght {

	public static void main(String[] args) {

		int [][] numbers= {{1,2,3,4},{5,6},{9,10,11,23,30,50,60}};
	
		//	System.out.println(Arrays.deepToString(numbers));
		//display the number of rows
		System.out.println(numbers.length);
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println("the number of columns " +i+"is:"+numbers[i].length);
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				
				System.out.println(numbers[i][j]);
			}
		}
		
		
	
			}
		
		
		
		
	}


