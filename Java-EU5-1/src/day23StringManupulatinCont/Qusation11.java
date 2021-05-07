package day23StringManupulatinCont;

public class Qusation11 {

	public static void main(String[] args) {
			
			
/*	String str="abc hi hi hijo ho";		
	int count=0;
	for (int i = 0; i < str.length()-1; i++) { //lenght()-1 yapmazsan boundry sornuu veriri
		if( str.substring(i, i+2).equals("hi")){
				count++;
	}
	}
	System.out.println(count);	


	}*/
		
	countHi("hiasdgashdhhiureýtyuýdfhi");	
	System.out.println(countHi("hiasdgashdhhiureýtyuýdfhi"));	
	}
	public static int countHi(String word) {
		
		int count=0;
		for (int i = 0; i < word.length()-1; i++) { //lenght()-1 yapmazsan boundry sornuu veriri
			if( word.substring(i, i+4).equals("hi")){  // 3 kelime için length-2 olmalý
					count++;
			}
		}
		return count;
	}
	}	

