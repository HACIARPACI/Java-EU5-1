package Lab3;

public class question7 {

	public static void main(String[] args) {

//	String message =comboString("hello","hi")	;
//	String message =comboString("hello","haci")	;
	String message =comboString("haci","arpaci")	;
		System.out.println(message);
		
	}

	public static String comboString(String word1, String word2) {
      String combo="";
		if(word1.length()>word2.length())
		combo=word2+word1+word2;//concat ile de yazýlablir
		else {
		combo=word1+word2+word1;	//concat ile yazýlablir
		}
		
		return combo;
	}

}
