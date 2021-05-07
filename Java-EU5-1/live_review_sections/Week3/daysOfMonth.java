package Week3;

public class daysOfMonth {

	public static void main(String[] args) {

		int month=10;
		switch (month){
		
		case 2:
			System.out.println("28 days");
		case 4:
		case 6:			
		case 9:
		case 11:
			System.out.println("30days");
		case 1:
		case 3:
		case 7:
		case 8:
		case 10:	
		case 12:
			System.out.println("31 days");
		}
		
	}

	
	
}
