package day28Part5LabCont;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {

		int[]x= {1,2,3,4,2,3,4,5,6,7,7,5,7};
		
		System.out.println(Arrays.toString(firstLast(x)));
		
	}

	public static int[] firstLast(int[]numbers) {
		int dummy=numbers[0];
		numbers[0]=numbers[numbers.length-1];
		numbers[numbers.length-1]=dummy;
		return numbers;
		
	}
	
}
