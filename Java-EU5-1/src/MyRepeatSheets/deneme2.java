package MyRepeatSheets;

public class deneme2 {

	public static void main(String[] args) {
 
	String word="aabbcc";
	String result="";
	for (int i = 0; i < word.length(); i++) {
		String deðiþken=""+ word.charAt(i);
		if (result.contains(deðiþken)) {
			continue;
		}
		result+=deðiþken;
		
	}
	System.out.println(result);
	}
	
}

