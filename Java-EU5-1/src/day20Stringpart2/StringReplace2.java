package day20Stringpart2;

public class StringReplace2 {

	public static void main(String[] args) {

		
	String sentence=" Coding is fun, it is my hobby ";	
	String withNoSpaces= sentence.replace(" ", "");
	System.out.println(withNoSpaces); 
	
	// replace , with!!!
	System.out.println(sentence.replace(",", "!"));
	
	String mixed="&^@#j$a-v|a@#$";
	mixed=mixed.replace("&^@#", "120");
	System.out.println(mixed);	
	mixed=mixed.replace("$", "hac�")	;
	System.out.println(mixed);
		
	String result=" hac� born at 1985 in Ni�de";
	
	result= result.replace("hac�", "").replace("in Ni�de", "").replace("born at", "");
	System.out.println(result);
	}

}
