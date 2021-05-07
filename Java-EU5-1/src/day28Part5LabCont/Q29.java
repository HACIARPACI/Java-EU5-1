package day28Part5LabCont;

import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {

		int[]x= {2,10,3,10,4,20,5};
		System.out.println(Arrays.toString(tenRun(x)));
		
	}
public static int[] tenRun(int[]numbers){
	
	for (int i = 0; i < numbers.length-1; i++) {
		if(numbers[i]%10==0) {
			for (int j = i+1; j < numbers.length&&numbers[j]%10!=0; j++) {
				numbers[j]=numbers[i];//j2 10
				
			}
			
		}		
		
	}
	return numbers;
}

}
