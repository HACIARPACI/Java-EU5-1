package day28Part5LabCont;

import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {
		
	int[]x= {1,2,3,4};
	System.out.println(Arrays.toString(doubled(x)));
	
	
	
		
	}
public static int[] doubled(int[]numbers) {
	
	int[]second =new int [(numbers.length)*2];
	second[second.length-1]=numbers[numbers.length-1];
	return second;
	
}
	
	
}
