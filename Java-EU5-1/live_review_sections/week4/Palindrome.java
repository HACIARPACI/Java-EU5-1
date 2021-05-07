package week4;

public class Palindrome {

	public static void main(String[] args) {
		String str="SELAMMALES";
		String result="";
		for (int i = str.length()-1; i >=0; i--) {
			result +=str.charAt(i);
		}
		if(result.equals(str)) {
			System.out.println("palendrome");
		}else
			System.out.println("not palendrome");
		
	}

}
