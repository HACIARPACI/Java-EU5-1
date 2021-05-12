package day31ArrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {

		ArrayList<String>cities=new ArrayList<>();
		cities.add("London");
		cities.add("Virginia");
		cities.add("Dc");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
//print each city by usingfor-each loop		
		
		for (String city : cities) {
			System.out.println(city+" ");
			
		}
		System.out.println("----------------------");
// print with the for ierator		
	
for (int i = 0; i <cities.size(); i++) {
	
	System.out.println(cities.get(i));
	
}		
	System.out.println("--------------------------");	
		System.out.println("removing Baku");
cities.remove("Baku");
cities.remove("NewYork");
System.out.println(cities.toString());//remove first baku

cities.add(0,"Arlington");
cities.add(1, "Istanbul");

System.out.println(cities.toString());
cities.add(2,"Ankara");
System.out.println(cities.toString()); 

System.out.println("-----------------------");
		
int idx=cities.indexOf("Istanbul");		
		System.out.println(idx);
		
cities.clear();		
boolean empty=cities.isEmpty();		
		System.out.println(empty);
System.out.println(cities.toString());		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
