package day_19stringManipulationPart1;

public class StringLength {

	public static void main(String[] args) {

		String str ="java";
		System.out.println(str.length());
		int x= str.length();
		System.out.println(x*10);
		
		String str1=new String("Java");
		System.out.println(str1.length());
		
		
		
		
		String name ="hacýarpacý";
		System.out.println(name.length());
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.contains("acý"));
		System.out.println(name.concat(" bucu").concat(" 123"));
	}

	
}
