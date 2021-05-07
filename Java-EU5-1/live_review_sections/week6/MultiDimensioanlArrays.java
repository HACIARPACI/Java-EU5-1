package week6;

import java.util.Arrays;

public class MultiDimensioanlArrays {

	public static void main(String[] args) {

		int []a1= {10,20};
		int [][] arr2D= {{10,20},{40,60},{100,120,130} };
		System.out.println(arr2D.length);
		System.out.println(Arrays.deepToString(arr2D));// two dimensional array için bu kullnýlýlýr
		System.out.println(Arrays.toString(arr2D[2])); // one dimensioançiç kullanýlýr
		System.out.println(arr2D[2][2]); 
		
		
		String []group1= {"serap","akhtam"};
		String []group2= {"neziha","bünyamin"};
		String []group3= {"rüstem","harun"};

		String[][] groups= { group1,group2,group3};
		// rüstem
		
		System.out.println(groups[2][0]); 
		
		// print each group
		for (int i = 0; i < groups.length; i++) {
			String []eachGroup=groups[i];
			System.out.println(Arrays.toString(eachGroup));
			
			for (int j = 0; j < eachGroup.length; j++) {
				String eachMember=eachGroup[j];
				System.out.println(eachMember);
			}
			
		}
		
		
		
		
		
		
	}

	
	
}
