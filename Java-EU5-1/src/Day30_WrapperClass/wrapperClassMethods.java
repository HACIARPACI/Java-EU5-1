package Day30_WrapperClass;

public class wrapperClassMethods {

	public static void main(String[] args) {
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));
		
		System.out.println(Character.isLetter('j'));// method return type is boolean
		System.out.println(Character.isLetter('&'));
		
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('d')); 
		
		String word="java101";
		System.out.println(Character.isAlphabetic(word.charAt(0)));
		
		System.out.println(Character.isDefined(word.charAt(6)));
		
		System.out.println(Character.isAlphabetic('A'));
		System.out.println(Character.isDigit('5'));
		
		
		
		
		
		
		
	}

}
