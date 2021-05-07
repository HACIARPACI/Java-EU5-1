package week6;

import java.util.Arrays;
import java.util.Random;

public class RandomClass{


	public static void main(String[] args) {
		
	

		Random rn=new Random();
		
		int []array=new int[10];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i]=rn.nextInt(100);
			
		}
		System.out.println(Arrays.toString(array));	
		
		}
		
		
		
	
		
	
		
		
		
		
		
		
	}
	
	


