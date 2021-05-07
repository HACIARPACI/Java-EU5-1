package Week3;

import java.util.Iterator;

public class Faktoriel {

	public static void main(String[] args) {
	
		
		/*int num=5; 
			int result =1;
		for (int i = 1; i<=num; i++) {
			result*=i;
		}
			System.out.println(result);*/
		fac(6);
		System.out.println(fac(6));
		
		}
		public static int fac(int num) {
			int fac=1;
			for (int i= 1; num>=i ; i++) {
				fac*=i;
			}
			return fac;
			
			
			
		/*  int number=5;
		        int result=1;

		        for(int i=1; i<=number; i++) {

		            result*=i;

		        }

		        System.out.println("factory of " + number + " is "+ result);*/
		}
		
	}


