package day28Part5LabCont;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {

		int[]x= {1,2,3,78};
		System.out.println(Arrays.toString(rotateLeft(x)));
	}

	
	public static int[] rotateLeft(int[]arr ) {
			int x=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=x;
		return arr;
	}
	
	}

