package day26arraysPart3;

import java.util.Scanner;

public class MethodArrays2 {

	public static void main(String[] args) {

	System.out.println(findCar(4,"bmw"));
		
		
	}

	
	public static String[] createArray(int arraySize) {
		Scanner scan =new Scanner(System.in);
		String[]carArray=new String[arraySize];
		for (int i = 0; i < carArray.length; i++) {
			System.out.println("enter your car # "+ (i+1));
			carArray[i]=scan.next();
			
		}
		return carArray;
	}
	
	public static boolean findCar(int value, String toFindCar) {
		
		for (String car:createArray(value)) {
			
			if(car.equalsIgnoreCase(toFindCar)) {
				
				
				return true;
			}
		
			}
			
			return false;
			
		}
		
		
		
	}
	
	

