package day28Part5LabCont;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {

		
	int[]x= {1,2,3,4,5};	
	int[]y= {};
		System.out.println(Arrays.toString(secondArray(x,y)));
		
	}

	public static int[] secondArray(int[]numbers,int[]y) {
		y=new int [2];
	
			
			y[0]=numbers[0];
			y[y.length-1]=numbers[numbers.length-1];
		
		
		return y;
		
	}
		
	
}
