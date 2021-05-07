package day13MethodsPart1;


public class CreditCardMethod {

	public static void main(String[] args) {	
		
		double salary=55000;
		int creditRating=8;
		
		if(salary>=20000 &&creditRating>=7) {
			qualify();
		}else {
			noQualify();
		}
		
	}

	public static void noQualify() {
		System.out.println("im sorry you re not quaalify to credit card");
	}

	public static void qualify() {
		System.out.println("comgrad you re qualified to credit card");
		
	}

	
}
