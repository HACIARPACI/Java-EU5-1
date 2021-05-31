package week9;

public class Accounts {

	public static void main(String[] args) {
		
		Credentials facebook= new Credentials();
	//	facebook.username="123";
	//	facebook.password="9876";
		
		facebook.setUsername("haciarpaci12@gmail.com");
		System.out.println(facebook.getUsername());
		facebook.setPassword("Arpaci1056");
		System.out.println(facebook.getPassword());
	}
	
}
