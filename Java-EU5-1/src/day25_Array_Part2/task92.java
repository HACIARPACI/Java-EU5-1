package day25_Array_Part2;

import java.util.Arrays;

public class task92 {

	public static void main(String[] args) {
		
			
			int [] numbers= new int[10];
			for (int i = 0; i < numbers.length; i++) {
				
				numbers[i]=i+1;
			
			}
			for (int i = 0; i < numbers.length; i++) {
				
				System.out.println(numbers[i]*19);
				
			}
			
		System.out.println(Arrays.toString(numbers));// arrays s�n�f�na array ad�n� yaz�ca iceri�ini al�yoruz.
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.toString(numbers));
	}

}
