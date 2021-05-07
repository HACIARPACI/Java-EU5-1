package week4;

public class StringMuhtarFirstNonDuplicated {

	public static void main(String[] args) {

		
		String Str="aaabcchgffdhccdeefghgfhef";
		String result="";
		for (int i = 0; i <Str.length(); i++) {
			
			String letter=""+Str.charAt(i);
				
			for (int j = 0; j < Str.length(); j++) {
				
				if(result.contains(letter)){
					continue;
					
				}
				result+=letter;
			} 
			
		}
		
		System.out.println(result);
		
	}

}
