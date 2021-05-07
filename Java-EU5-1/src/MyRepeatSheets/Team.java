package MyRepeatSheets;

public class Team {

	String name;
	int PlayerNumber;
	int TotalCup;
	int ClubCost;
	
	
	
	public void manager(String name) {
		System.out.println(name+" football club has"+ TotalCup+" cups");
	}
	public void Description(int TotalCup) {
		if(TotalCup>20) {
			ClubCost=1000000;
			System.out.println(ClubCost);
		}else {
		    System.out.println("Daha cok kupa kazan");
	}
	
}
}