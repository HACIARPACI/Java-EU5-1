package day15_Part3;

public class task70 {

	public static void main(String[] args) {

/*	int x= calculateHighScorePosition(500);
		displayHighScorePosition("mike",x);
		displayHighScorePosition("tom", calculateHighScorePosition(500));
	}
	
	public static void displayHighScorePosition( String playerName, int highScorePosition) {
		
		System.out.println(playerName+" managed to get into position"+highScorePosition+" on the high score table");
	}
	public static int calculateHighScorePosition(int playerScore) {
		if(playerScore>=1000) {
			return 1;										// highscoreposition i�inde player score yazd�r�yor
		}else if(playerScore>=500&&playerScore<1000) {		//ikili methodda i�i i�e yazd�r�yor. return olan� di�eri i�inde 
			return 2;                                       //yazd�r�yor kendin de yaz!!!
		}else if(playerScore>=100&&playerScore<500) {
			return 3;
		}else {
			return 4;
		}*/
		int x=calculateHighScorePosition(750);
		displayHighScorePosition("hac�",x);
		
		
	}
	
public static void displayHighScorePosition(String name,int position) {
	System.out.println(name+"managed to get  into position"+position); 
	
	
	
}
	public static int calculateHighScorePosition(int score) {
		if(score>=1000) {
			return 1;
		}else if(score>=500&&score<1000) {
			return 2;
		}else if(score >=100&&score<500) {
			return 3;
		}else {
			return 4;
		}
		
		
		
		
		
		
	}
	
}






