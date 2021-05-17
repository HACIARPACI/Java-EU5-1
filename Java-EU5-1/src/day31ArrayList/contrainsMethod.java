package day31ArrayList;

import java.util.ArrayList;

public class contrainsMethod {

	public static void main(String[] args) {

		ArrayList<String>List1=new ArrayList<>();
		
		List1.add("Jan");
		List1.add("Feb");
		List1.add("Mar");
		List1.add("April");
		List1.add("May");
	
		System.out.println(List1.toString());
		
		ArrayList<String>List2=List1;
		List2.add("hacý");
		System.out.println(List2);
		
		
		
		// copy all values from List1
		ArrayList<String>months= new ArrayList<String>(List1);// list 1 i months a kopyaladý
		months.add("june");
		months.add("july");
		months.add("august");
		System.out.println(months);
		System.out.println("-------------------------");
		
		System.out.println(months.contains("Jan"));
		
		//how to check if february is in the second position
		
		System.out.println(months.indexOf("Feb")==1);
		System.out.println(months.get(1).equals("Feb"));
		System.out.println(months.get(months.size()-1).equals("august"));
		List1.add("Jan"); // iki tane Jan var months kapsadýgý için  true veriyor
		System.out.println("List1: "+List1);
		System.out.println("months :"+ months);
		
		if(months.containsAll(List1)) {
			System.out.println("months has all List1");
		}else {
			System.out.println("some values are missing");
		}
		
		
	
		
		
		
		
	}

}
