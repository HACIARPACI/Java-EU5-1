package day_19stringManipulationPart1;

import java.util.Iterator;

public class task79vowel {

	public static void main(String[] args) {

		/*String word="CybertekSchool"; //a,e,,o,i,u
		
		for (int i = 0; i < word.length(); i++) {
			char letter=word.charAt(i);
			if(letter=='a'||letter=='e'||letter=='o'||letter=='i'||letter=='u') {
			System.out.print(letter);
			if(i!= word.length()-2) {
			System.out.print(",");
		}
		}
		}*/
		
		String word="Cybertekschool";
		for (int i = 0; i < word.length(); i++) {
			char a =word.charAt(i);
			 if(a=='e'||a=='a'||a=='o'||a=='i'||a=='u') {
				 System.out.print(a);
			if(i!=word.length()-2) {
				System.out.print(",");
			}
		}
			
		}
		
		
		
		
		
		
	}

}
