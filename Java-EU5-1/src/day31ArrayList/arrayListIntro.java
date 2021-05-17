package day31ArrayList;

import java.util.ArrayList;

public class arrayListIntro {

	public static void main(String[] args) {
//creating ArrayList
		ArrayList<String> names=new ArrayList<>();
		ArrayList<Integer> nums=new ArrayList<>();
//Assigning values to ArrayList		
		
		names.add("Mike");
		names.add("Smith");
		names.add("Hacý");
		names.add("Emmy");
		names.add("Saime");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(123123)
	;	nums.add(new Integer("100"));
		System.out.println(nums);
//Reading from ArrayList		
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));

System.out.println("Names count: "+ names.size());		
System.out.println("Nums count :"+ nums.size());		
System.out.println(names.toString());		
		
		
		
		
		
		
		
	}

}
