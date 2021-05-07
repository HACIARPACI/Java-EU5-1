package day28Part5LabCont;

import java.util.Arrays;

public class Q17_2 {

	public static void main(String[] args) {


	int[]x= {8,6,5,4,1,2,3,7,10};	
		System.out.println(differ(x));
		
		
		
		
	}
public static int differ(int []numbers) {
	int result=0;
	Arrays.sort(numbers);
	result=numbers[numbers.length-1]-numbers[0];
	return result;
	
	
	
}
}
