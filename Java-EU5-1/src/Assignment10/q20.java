package Assignment10;

import java.util.Iterator;

public class q20 {

	public static void main(String[] args) {

		factorial(5);
		
		
	}

	public static void factorial(int num) {
		int sum=1;
		for (int i = 1; i <=num; i++) {
			
			sum*=i;
			
		}
		System.out.println(sum);
	}
	
}
