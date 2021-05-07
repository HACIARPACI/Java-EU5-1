package Lab3;

public class question9 {

	public static void main(String[] args) {

		
//	String message=right2("Hello");	
//	String message=right2("hi");	
	String message=right2("ssageme");	

	System.out.println(message);	
		
	}

	public static String right2(String word) {
		String newVersion="";
		if(word.length()>=2) {
			newVersion=word.substring(word.length()-2)+word.substring(0, word.length()-2);//concat olabilir
		}
		return newVersion;
	}

}
