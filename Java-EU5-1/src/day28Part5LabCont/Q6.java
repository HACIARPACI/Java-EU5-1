package day28Part5LabCont;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {

		int[]x= {1,20,3};
		System.out.println(Arrays.toString(greatest(x)));
	//System.out.println(greatest(x));
		
		
	}
	
	public static int[] greatest(int[]numbers) {
		int biggest=0;// bunun yeri biggest= numbers[0] olarak ta baslayabilirsin
	for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]>biggest) {
			biggest=numbers[i];
		}
				
		}
	for (int i = 0; i < numbers.length; i++) {
		numbers[i]=biggest;
	}
	return numbers;
	}

	
	
	
	
	
	
}


