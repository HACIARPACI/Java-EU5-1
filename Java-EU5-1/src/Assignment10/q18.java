package Assignment10;

public class q18 {

	public static void main(String[] args) {

		bigString("word","X",3);
		
		
		
	}

	
	public static void bigString(String word,String word2,int num) {
		String newWord=word;
		for (int i = 1; i < num; i++) {
			
			newWord=newWord+word2+word;
			
			
				
			}
			System.out.println(newWord);
		}
		
		
		
		
	}

