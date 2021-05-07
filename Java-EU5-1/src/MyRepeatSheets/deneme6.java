package MyRepeatSheets;

public class deneme6 {

	public static void main(String[] args) {
		calculateHighScorePosition(700);
		displayHighScorePosition("HACI",calculateHighScorePosition(700));	
		
		
	}
public static void displayHighScorePosition(String name,int position) {
	System.out.println(name+ " managed to get into position "+ position);
	
}
	public static int calculateHighScorePosition(int score) {
	if(score>=1000) {
		return 1;
	}else if(score<1000) {
		return 2;
	}else {
		return 4;
	}
	
		
	}
	
}
