package day25_Array_Part2;

import java.util.Scanner;

public class PassArray {

	public static void main(String[] args) {
		int []numbers=new int[4];
		//pas the array to getValues method
		getValues(numbers);
		
		System.out.println("here are the numbers that you entered");
	//pass the array to show array method
		showArray(numbers);
	}

	public static void getValues(int []array) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a series of"+ array.length+" numbers");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("enter number "+(i+1)+" :");
			array[i]=scan.nextInt();
		}
						
		}
	public static void showArray(int[]array) {
		for (int value : array) {
			System.out.println(value);
		}
	}
	
}
