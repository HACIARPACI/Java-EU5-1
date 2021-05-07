package day28Part5LabCont;

import java.util.Arrays;

public class Q28 {

	public static void main(String[] args) {

		   
        fizzArray3(5, 10); // → [5, 6, 7, 8, 9]
        fizzArray3(11, 18);//  → [11, 12, 13, 14, 15, 16, 17]
        fizzArray3(1, 3); // → [1, 2]*/
        
        System.out.println(Arrays.toString(fizzArray3(5, 10)));
        System.out.println(Arrays.toString(fizzArray3(11, 18)));
        System.out.println(Arrays.toString(fizzArray3(1, 3)));
        

    }
    
    public static int []  fizzArray3(int x, int y) {  
    
        int [] arr = new int [y-x];
        
        for (int i=0, j = x; i < arr.length && j<y; i++, j++) {
            
            arr[i]=j;
        }
        
        
        return arr;
        
    }
  
		
		
		
		
}
