package Replit;

import java.util.Arrays;

import utilities.ArraysUtility;

public class replitExamples {
	
	public static void main(String[] args) {
		int sum=0;
		
		
		String str="34hj8ejh8843sdkfjsj453f%&/(";
		for (char each : str.toCharArray()) {
			if(Character.isDigit(each)) {
				sum+=Integer.parseInt(""+each);
			}
			
		}
		System.out.println(sum);
		
		String word = "abc@!de$f%ghi1kl2m3n4b5v6";
		String digits ="";
		String letters = "";
		String specialChars = "";
		for (char each : word.toCharArray()) {
			if(Character.isDigit(each)) {
				digits+=each;
			}else if(Character.isLetter(each)) {
				letters+=each;	
				}else {
					specialChars+=each;
				}
				
				
			}
			
		System.out.println(specialChars);
		System.out.println(digits);
		System.out.println(letters);
		}
		
		
		
		
	}
