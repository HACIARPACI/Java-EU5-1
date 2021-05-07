package day28Part5LabCont;

import java.util.Arrays;

public class q14 {

	public static void main(String[] args) {

	int[]x= {1,2,3};	
	int[]y= {4,5,6,8,7,8,9,7,9,9,8,89};	
//	int[]collection=new int[arr1.length+arr2.length];
	System.out.println(Arrays.toString(sumArray(x,y)));	
		
	}
   public static int[] sumArray(int[]arr1,int[]arr2) {
	
	int[]collection=new int[arr1.length+arr2.length];
	for (int i = 0; i < arr1.length; i++) {
		collection[i]=arr1[i];
	}
	int a=0;
	for (int i = arr1.length; i < collection.length; i++) {
		collection[i]=arr2[a];
		a++;
	}
	return collection;
}
	
}
