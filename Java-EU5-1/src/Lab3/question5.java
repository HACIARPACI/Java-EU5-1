package Lab3;

public class question5 {

	public static void main(String[] args) {

//	String message=	firstHalf("WooWoo");
	String message=	firstHalf("doubledoubledouble");
//	String message=	firstHalf("123456789");
		System.out.println(message);
	}

	public static String firstHalf(String word) {
		String half="";
		if(word.length()%2==0) {
			half=word.substring(0, word.length()/2);
			//return half;
		}
		
		return half;
	}
//int x =word.length()/2;
//return word.substring(0,x);	
	
}
