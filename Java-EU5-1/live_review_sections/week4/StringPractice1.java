package week4;

public class StringPractice1 {

	public static void main(String[] args) {

		String str1="Java";
		String str2="Java";
		String str3="Java";
		//in string pool on one object "java" being shared sstr1,2,3
		System.out.println(str1==str2);
		String s1 = new String("Java"); //keyword
		String s2 = new String("Java");
		String s3 = new String("Java");
				System.out.println(s1==s2);		
		boolean x=s1.equals(str1);
		System.out.println(x);
		
		
		
	}

}
