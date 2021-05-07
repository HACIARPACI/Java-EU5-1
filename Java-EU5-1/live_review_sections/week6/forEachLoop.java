package week6;

import utilities.MathUtility;
import week4.MathUtilities;

public class forEachLoop {

	public static void main(String[] args) {

		int[]array= {1,2,5,4,6,8};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
			System.out.println("---------------");
			for (int list : array) {
				System.out.print(list);
				System.out.println("---------------");

				int[]numbers= {10,5,6,48,12,21};
				int max=numbers[0];
				int min=numbers[0];
				for (int each : numbers) {
					max=MathUtility.max(each,max);
					min=MathUtilities.min(each,min);
					
				} 
				
				System.out.println(max);
				System.out.println("--------------------");
				
				int []nums= {10,20,30,40,50,60,70,80,90};
				int sum=0;
				for (int each : nums) {
					sum+=each;
				}
				
				System.out.println("sum : "+sum);
				System.out.println("avarage: "+(sum/nums.length));
				
				
				
				
				
				
				
				
			}
				
		
			
			
			
			
			
		}
		
		
		
		
	}


