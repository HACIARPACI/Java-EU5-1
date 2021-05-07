package day_19stringManipulationPart1;

public class StringCharAt {

	public static void main(String[] args) {
		 
		String word= "computer";
		System.out.println(word.length());
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
/// bu hane olmaz 0la baþlýyor 		System.out.println(word.charAt(8)); 
		// check if first character is 'A'
		String word2 ="Apple";
		if(word2.charAt(0)=='A') {
			System.out.println("A is first character");
		}else {
			System.out.println("A is not first character");
		}
		
		// check first and the last chaaracater are same??
		String word3="civic";
		if(word3.charAt(0)==word3.charAt(4)) {
			System.out.println("first and the last character are same");
		}else {
			System.out.println("not same");
		}
		//////////////////////
		
		char first=word3.charAt(0);
		char last= word3.charAt(4);
		if(first==last){
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		//// last index hard coded
		String word4= "hacýarpacý";
	//	char lastChar=word4.charAt(word4.length()-1);
		
		
		char lastChar= word4.charAt(word4.length()-1);
		System.out.println("last char of"+word4 + "is "+lastChar);
		
		
	}

}
