package week1;

public class stringDeneme {

	public static void main(String[] args) {
		String s1= new String("hacý");
		System.out.println(s1.length());
		System.out.println("1. idndex "+ s1.charAt(1));
		System.out.println("2. index"+ s1.charAt(s1.length()-2));
		System.out.println(s1.startsWith("ha"));
		System.out.println(s1.endsWith("cý"));
	}

}
