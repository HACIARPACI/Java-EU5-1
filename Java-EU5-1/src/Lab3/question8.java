package Lab3;

public class question8 {

	public static void main(String[] args) {

		
	//	String message=left2("hello");
//		String message=left2("mewelco");
		String message=left2("hi");

		System.out.println(message);
		
		
	}

	public static String left2(String word) {
		String newVersion="";
		if(word.length()>=2) {
			newVersion=word.substring(2)+word.substring(0, 2);	
			// return word.substring(2)+word.substring(0, 2);	þeklinde kýsa yazýlablir
		}		
		return newVersion;
	}

}
