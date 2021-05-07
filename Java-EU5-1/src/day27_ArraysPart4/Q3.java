package day27_ArraysPart4;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {

		int[]x= {1,2,3};
		int[]y= {1,1};
		System.out.println(checkFirstandLast(x,y));
		
	}

public static String checkFirstandLast(int[]first,int[]last) {
	if(!(first.length>1)) {
		return "array1 is not valid";
	}if(!(last.length>1)) {
		return"array 2 is not valid"; 
	}if(first[0]==last[0]||first[first.length-1]==last[last.length-1]) {
		return "true";
	}else {
		return" false";
	}
	
	
	
	
}
	
}
