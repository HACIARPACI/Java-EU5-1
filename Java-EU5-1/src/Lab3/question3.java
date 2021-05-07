package Lab3;

public class question3 {

	public static void main(String[] args) {

//	String message=	extraEnd("Hello");
//	String message=	extraEnd("i");
	String message=	extraEnd("Helloworld");

		System.out.println(message);
	}

	public static String extraEnd(String word) {
	String copied="";
		if(word.length()>=2) {					
		copied= (word.substring(word.length()-2))
				+(word.substring(word.length()-2))+(word.substring(word.length()-2));
		//copied=(word.substring(word.length()-2)
		//return copied+copied+copied;  daha kýsa yapýlablir
		
	}
		return copied;
		
	}
	
	}



