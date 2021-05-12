package Day32ArrayListCont;

import java.util.ArrayList;

public class equalMethod {

	public static void main(String[] args) {

		ArrayList<String>friends1=new ArrayList<>();
		ArrayList<String>friends2=new ArrayList<>();

		friends1.add("mike");
		friends1.add("smith");
		friends1.add("john");
		friends1.add("tommy");
		

		friends2.add("mike");
		friends2.add("smith");
		friends2.add("john");
		friends2.add("tommy");
		
		System.out.println(friends1);
		System.out.println(friends2); 
		
		if(friends1.equals(friends2)) {
			System.out.println("same friends");
		}else {
			System.out.println("different");
		}
		
		
		System.out.println(friends1==friends2);
		

	}

}
