package week5;

public class FrequencyOfWords {

	public static void main(String[] args) {

	/*	String sentence="javajavajavajavajavajavajava";
		String word="java";
		
		int count=0;
		while(sentence.contains(word)) {
			sentence=sentence.replaceFirst(word, "");
			count++;
			
			
		}
		
		System.out.println(count);*/
		frequencyOfWord("asjhkjhasdlkjkladkljhasd","a");
		System.out.println(frequencyOfWord("asjhkjhasdlkjkladkljhasd","a"));
	}
	
	
	
	
	public static int frequencyOfWord(String sentence, String word) {
		
		int count=0;
		while(sentence.contains(word)) {
			sentence=sentence.replaceFirst(word, "");
			count++;
		
		
	}
return count;
}
}





