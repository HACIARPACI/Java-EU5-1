package day24_arrays_part1;

import java.util.Random;

public class tsayısal_loto {

	public static void main(String[] args) {
		
		Random rn=new Random();
		int array[]=new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i]=rn.nextInt(49)+1;
			System.out.print( array[i]+" ");
			
		}
		System.out.println(" rastgele :) ");

		
	}

}
