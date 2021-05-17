package day31ArrayList;

import java.util.ArrayList;

public class removeInteger {

	public static void main(String[] args) {	
		
		ArrayList<Integer> nums=new ArrayList<>();
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(0);
		nums.add(56);
		nums.add(5);
		nums.add(10);
		nums.add(44);
		nums.add(55);
		nums.add(1);
		System.out.println(nums.toString());
		nums.remove(1);
		System.out.println(nums);
		nums.remove(5);
		System.out.println(nums.toString());
		Integer n1=new Integer(5);
		Integer n2=Integer.valueOf(5);
		System.out.println("----------------");
		nums.remove(n1);
		System.out.println(nums.toString());
		
		nums.remove(new Integer(44));// silerken object siliyoruz
		System.out.println(nums);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
