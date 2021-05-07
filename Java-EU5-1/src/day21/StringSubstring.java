package day21;

public class StringSubstring {

	public static void main(String[] args) {

	String sentence ="Java String Manuoulation is fun!";
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5,11));
		System.out.println(sentence.substring(5,sentence.length()-5));

		String Chars="{{}}";
		String word="AUTOMATION";

		String result= Chars.substring(0,2)+word+Chars.substring(2);
		System.out.println(result);
		
		
		
	}
}
