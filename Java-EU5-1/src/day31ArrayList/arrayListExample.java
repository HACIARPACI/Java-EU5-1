package day31ArrayList;

import java.util.ArrayList;


public class arrayListExample {

	public static void main(String[] args) {

		// languages
		//Print sizearrayList
		//Read couple of elements
		
		ArrayList<String> Lang= new ArrayList<>();
		Lang.add("english");
		Lang.add("spanish");
		Lang.add("germany");
		Lang.add("chienesse");
		
		System.out.println(Lang.size());
		System.out.println(Lang.get(2));
		System.out.println(Lang.toString());
		
		Lang.add("russian");// sona ekler
		Lang.remove(0);
		System.out.println(Lang.toString());
		
		Lang.set(0, "arabic");
		System.out.println(Lang.toString());
		
		System.out.println("number of values :"+Lang.size());
		
		
		
		
		
		
		
		
		
		
	}

}
