package Lab3;

public class question6 {

	public static void main(String[] args) {

//	String message= withoutEnd("Hello");
//	String message= withoutEnd("Hello");
	String message= withoutEnd("im without first and last");

	
	System.out.println(message);
		
		
		
	}

	public static String withoutEnd(String word) {

	String shorter=word.substring(1, word.length()-1)	;
		return shorter;
	}

	//return word.substring(1, word.length()-1); þeklimde daha kýsa yazýlablir
	
}
