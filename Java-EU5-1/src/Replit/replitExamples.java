package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import utilities.ArraysUtility;

public class replitExamples {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> numsList=new ArrayList<>();
		
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);	
		ArrayList<Double>doubleList=new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double total =sumList(doubleList);
		System.out.println(Math.round(total));
		

		ArrayList<Integer>list= getList(40);
		System.out.println(list.toString());
		
		
		ArrayList<Integer>rList=getRandomList(20);
		System.out.println(rList.toString());
		

		ArrayList<String> strNums=new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		ArrayList<Integer>converted=convertToIntList(strNums);
		System.out.println(converted);
		
		}
		
public static ArrayList<Integer> convertToIntList(ArrayList<String> strNums) {
		
	ArrayList<Integer>list3=new ArrayList<>();
	for (String each : strNums) {
		list3.add(Integer.parseInt(each));
		
		
	}
	return list3;
	
	
	
	
	}

	public static void printList(ArrayList<Integer>nums) {
		
		for (Integer each : nums) {
			System.out.println(each);
		}		
	}
	public static double sumList(ArrayList<Double>nums) {
		double sum=0;
		
		for (Double each : nums) {
			sum+=each;
		}
	
	return sum;	
	}
		public static ArrayList<Integer> getList(int num) {
			ArrayList<Integer>list=new ArrayList<>();
			
			for (int i = 1; i <= num; i++) {
				
				list.add(i);
			}
			
		return list;			
		}

	public static ArrayList<Integer> getRandomList(int num){
		ArrayList<Integer>list1=new ArrayList<>();
		Random r= new Random();
		for (int i = 0; i < num; i++) {
			
			list1.add(r.nextInt(101));
		}
		
		
		return list1;
		
		
		
		
	}
	}
