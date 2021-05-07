package MyRepeatSheets;

public class switchStat_gunHesaplama {

	public static void main(String[] args) {
		int gün=101;
		int day= gün%7;
		String bugun="friday";
		switch(day) {
		case 0:
			bugun="friday";
			break;
		case 1:
			bugun="saturday";
			break;
		case 2:
			bugun= "sunday";
			break;
		case 3:
			bugun="monday";
			break;
		case 4:
			bugun="tuesday";
			break;
		case 5:
			bugun="wednesday";
			break;
		case 6:
			bugun="thursday";
		}
		System.out.println("bugun"+bugun);
	}

}
