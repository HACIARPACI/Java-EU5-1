package week6;

import java.util.Arrays;
import java.util.Random;

public class RandomClass1 {

	public static void main(String[] args) {
Random rn=new Random();
		
		int []array=new int[5];
		for (int i = 0; i < array.length; i++) {
			array [i]=rn.nextInt(100);
			
		}
		System.out.println(Arrays.toString(array));
		
		int []numbers= {10,5,8,78,20};
		int max=numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
			
			
		}
		System.out.println("max :"+max); 
	
		
		
		
		
		
		
		
		
		
		
	}

}
