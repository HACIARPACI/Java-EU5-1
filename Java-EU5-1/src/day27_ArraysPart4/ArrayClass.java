package day27_ArraysPart4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
//toString 
		int []nums= {12,4,87,2,54,21};
		System.out.println(Arrays.toString(nums));
// equals		
		int[]num1= {4,5,6,10,100};
		int []num2= {4,5,6,10,100};
		System.out.println(Arrays.equals(num1, num2)); 
// sort
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String []languages= {"Zulu","spanish","$Italian","English","1polish","arabic"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
//binary search
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
		int []numx= {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(numx, 55));
		System.out.println(Arrays.binarySearch(numx, 5));//-2 inseetionPoint -1
		System.out.println(Arrays.binarySearch(numx, 15));
		System.out.println(Arrays.binarySearch(numx, 10));
		
//copyOf()      yeni object olusturur eski veriyi tekrar etmez..
		
		double[]d1= {2,3,3,5,12,3};
		double []d2=d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0]=100.3;
		d2[1]=400.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double []d3=Arrays.copyOf(d2, d2.length);
		
		System.out.println(Arrays.toString(d3));
		
		d2[0]=5.2;
		
		System.out.println(Arrays.toString(d3));
		System.out.println(Arrays.toString(d2));

		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	}

}
