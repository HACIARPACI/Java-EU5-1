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
		String hac�="";
	
	for (int i = 0; i < s.length(); i++) {
		if(Character.isAlphabetic(s.charAt(i))||s.charAt(i)==' ') {
			hac�+=s.charAt(i);
			
		}
		
		
	}
		return hac�;
		
		
		
	}		
	
}