package Replit;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class replitExamples {
	
	public static void main(String[] args) {

		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		System.out.println(filterString(str));
		
		
	
}
	public static String filterString(String s) {
		String hacý="";
	
	for (int i = 0; i < s.length(); i++) {
		if(Character.isAlphabetic(s.charAt(i))||s.charAt(i)==' ') {
			hacý+=s.charAt(i);
			
		}
		
		
	}
		return hacý;
		
		
		
	}		
	
}