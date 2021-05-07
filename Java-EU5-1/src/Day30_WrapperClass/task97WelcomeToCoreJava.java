package Day30_WrapperClass;

public class task97WelcomeToCoreJava {

	public static void main(String[] args) {

		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		System.out.println(filterString(str));

	}
	
	public static String filterString(String s) {
		
		String original ="";
		for (int i = 0; i < s.length(); i++) {
		 if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i)==' ') {
				original+=s.charAt(i);
		}
		}
	
	return original;
}
}