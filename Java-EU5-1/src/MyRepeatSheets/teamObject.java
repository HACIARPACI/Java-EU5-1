package MyRepeatSheets;
import java.util.Scanner;
public class teamObject {

	public static void main(String[] args) {
		Team team1= new Team();
	
		Team team2= new Team();
		
		team1.name="Galatasaray";
		team1.TotalCup=19;
		team1.PlayerNumber=11;
		
		
		
		team2.name="Fenerbahçe";
		team2.TotalCup=25;
		team2.PlayerNumber=11;
		team1.Description(25);
		
		team2.manager("fatih");
		
		team1.Description(15);
		
	
	}

	
}
