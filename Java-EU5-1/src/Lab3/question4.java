package Lab3;

public class question4 {

	public static void main(String[] args) {

//		String message =firstTwo("Hello");
//		String message =firstTwo("He");
		String message =firstTwo("H");
		
		System.out.println(message);
		
	}

	public static String firstTwo(String word) {
		if(word.length()<2) {
			return word;
		}else if(word.isEmpty()) {
			return "";
		}else {
			return word.substring(0, 2);
		}
		
	}
}
	

