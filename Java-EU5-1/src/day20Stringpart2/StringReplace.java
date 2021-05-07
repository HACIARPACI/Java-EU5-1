package day20Stringpart2;

public class StringReplace {

	public static void main(String[] args) {

		String str =" Moscow is the capial of Russia of Russia";
		str= str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		
		
		String email= "firstname_lastname@gmail.com";
		String company ="capitalone";
		String newEmail= email.replace("gmail", company);
		System.out.println(newEmail);
		System.out.println(email);
	}

}
