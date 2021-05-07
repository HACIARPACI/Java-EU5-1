package day20Stringpart2;

public class StringEquals {

	public static void main(String[] args) {

	
		String s1="Welcome to java";
		String s2="Welcome to java";
		String s3="Welcome to c++";
		
		boolean b1=s1.equals(s2);
		boolean b2=s1.equals(s3);
		System.out.println(b1+ "|"+b2);
		
		boolean b3 = s1==s2;  //pool a bakýyor
		boolean b4= s1==s3;
		
		System.out.println(b3+" |"+b4 );
		
		String s4 =new String("Welcome to java");
		System.out.println(s1==s4);// poola bkýyor new String farklý bir object
		System.out.println(s1.equals(s4)); //buada pool a bakmýyor value onemli
		
	}

}
