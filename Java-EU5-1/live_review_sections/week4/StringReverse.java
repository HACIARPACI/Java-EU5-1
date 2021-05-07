package week4;

public class StringReverse {

	public static void main(String[] args) {

		String name="hacýarpacý"; 
		String reverse="";
		reverse+=name.charAt(9);
		reverse+=name.charAt(8);
		reverse+=name.charAt(7);		
		reverse+=name.charAt(6);
		reverse+=name.charAt(5);
		reverse+=name.charAt(4);
		reverse+=name.charAt(3);
		reverse+=name.charAt(2);
		reverse+=name.charAt(1);
		reverse+=name.charAt(0);
			System.out.println(reverse);	
			
			String str=" Java Programming Language";
			String result="";
			for (int i = str.length()-1; i >= 0; i--) {
			result +=	str.charAt(i);
			}
			System.out.println(result); 
				
			
	
			
			
		
	}	

}

