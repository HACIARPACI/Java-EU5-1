package MyRepeatSheets;

public class deneme2 {

	public static void main(String[] args) {
 
	String word="aabbcc";
	String result="";
	for (int i = 0; i < word.length(); i++) {
		String de�i�ken=""+ word.charAt(i);
		if (result.contains(de�i�ken)) {
			continue;
		}
		result+=de�i�ken;
		
	}
	System.out.println(result);
	}
	
}

