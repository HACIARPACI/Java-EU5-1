package day_19stringManipulationPart1;

public class StringConcat {

	public static void main(String[] args) {
		String word2="hacý";
		String word="Java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse")); 
		System.out.println(word);
		
		word=word.concat("+ eclipse");
		System.out.println(word);
		
		word=word.concat(" Automation");
		System.out.println(word);
		System.out.println(word.concat(word2));//.concat kullanýrken sadece string eklenir
		
		
		word=word+123;
		System.out.println(word);
		
		String word3="Hi";
		word3=word3.concat("-hey").concat("how are you").concat("good");
		System.out.println(word3);
		
	}

}
