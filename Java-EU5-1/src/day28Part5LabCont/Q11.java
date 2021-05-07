package day28Part5LabCont;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {

		int []x= {2,3,0,2,3,2,3,2,3,2,33};
		System.out.println(Arrays.toString(change23(x))); 
		
		
	}

	public static int[]change23(int[]numbers){
		
		for (int i = 0; i < numbers.length-1; i++) {
			if(numbers[i]==2&&numbers[i+1]==3) {
				numbers[i+1]=0;
			}
			
			
		}
		return numbers;
		
	}
	
}
