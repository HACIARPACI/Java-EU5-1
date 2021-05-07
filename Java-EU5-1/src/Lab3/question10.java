package Lab3;

public class question10 {

	public static void main(String[] args) {

		
		
		boolean message = frontAgain("ikikereikik");
		System.out.println(message);
		
	}

	public  static boolean frontAgain(String word) {
		
	String first2=word.substring(0, 2);
	String last2=word.substring(word.length()-2);	
	return first2.equals(last2);
}
	}