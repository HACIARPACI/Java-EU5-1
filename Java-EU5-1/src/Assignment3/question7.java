Scanner package Assignment3;

public class question7 {

	public static void main(String[] args) {

		int priceInCents=65;
		int change=100-priceInCents;
		int quarters=(change/25);
		int dimes=(change%25/10);
		int nickles=(change%25%10/5);
		System.out.println("priceInCent:"+priceInCents);
		System.out.println("your change is "+quarters+"quarter ,"+dimes+"dimes, and  "+nickles+"nickles");
		
	}

}
