package day27_ArraysPart4;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {

		int[]x= {1};
		int[]y= {1,3,4,0};
		System.out.println(check(x));
		System.out.println(check(y));

		
		
	}

	
	public static String check(int[]arr) {
		
		if(!(arr.length>1)) {
			return "not valid array";
		}
		if(arr[0]==arr[arr.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
		
		
	}
}
