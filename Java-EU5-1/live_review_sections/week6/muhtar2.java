package week6;

import java.util.Arrays;

public class muhtar2 {

	public static void main(String[] args) {

		int []array= {1,0,2,0,3,0,4,5,6};
		int[]yeni=new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=0) {
				yeni[i]=array[i];
				
			}else if(array[i]==0) {
				yeni[i]=array[i+1];
			}
			
			
			
		}
		
		System.out.println(Arrays.toString(yeni));
		
	}

}
