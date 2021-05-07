package day28Part5LabCont;

import java.util.Arrays;

public class Q30 {

	public static void main(String[] args) {

		   int[] x = {1,2,3};
	        int n = 2;
	        System.out.println(Arrays.toString(notAlone(x, n))); //[1, 3, 3]
	        
	        int[] y = {1, 2, 3, 2, 5, 2};
	        int n1 = 2;
	        System.out.println(Arrays.toString(notAlone(y, n1))); //[1, 3, 3, 5, 5, 2]*/
	        
	        
	    }
	    
	    public static int [] notAlone(int[] x, int n) {
	        
	        for (int i = 1; i < x.length-1; i++) {
	            
	            if ((x[i]==n) && (x[i-1]> n || x[i+1]> n)) {
	            
	                x[i]= x[i-1]> x[i+1] ? x[i-1] : x[i+1];
	            }
	        }
	        
	        return x;
	    }
	    
		
		
		
	}


