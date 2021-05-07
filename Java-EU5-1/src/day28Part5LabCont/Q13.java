package day28Part5LabCont;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {

		int[]x= {1,2,3,4,5,6};
		int[]y= {5,6,7,0,55,2};
		largestsum(x,y);
	}

	
	public static void largestsum(int[]num1,int[]num2) {
		int sum1=0;int sum2=0;
			for (int value1 : num1) {
				sum1+=value1;
			}
			for (int value2 : num2) {
				sum2+=value2;
			}
		if(sum1>sum2) {
			System.out.println(Arrays.toString(num1));
		}else if(sum2>sum1) {
			System.out.println(Arrays.toString(num2));
		}else {
			System.out.println("equal");  
		}
		
		
		}
				
		
		
	}

