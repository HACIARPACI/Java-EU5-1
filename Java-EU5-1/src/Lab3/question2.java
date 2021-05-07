package Lab3;

public class question2 {

	public static void main(String[] args) {

	//String message=makeAbba("Hi","Bye");	
//	String message=makeAbba("Salam","toYou");	
	String message=makeAbba("Come","Back");	

		System.out.println(message);
		
	}

	public static String makeAbba(String word1, String word2) {

		return word1.concat(word2).concat(word2).concat(word1);
		
		
	}

	
	
}
