package Assignment10;

public class q21 {

	public static void main(String[] args) {

		trueOrFalse("abXYabc",2);
		
		
		
		
	}

	public static void trueOrFalse(String word, int num) {
		
		boolean output=false;
		String inputWord=word;
		String searchWord=word.substring(0, num);
		int count=0;
	while(word.contains(searchWord)) {
		
		word=word.replaceFirst(searchWord, "");
		count++;
		
		if(count>1) {
			output=true;
		}		
		}
	  System.out.println("input: " + inputWord);
      System.out.println("input: " + num);
      System.out.println("output: " + output);
      System.out.println(searchWord + " appears " + count + " only");
		
	}
	
}
