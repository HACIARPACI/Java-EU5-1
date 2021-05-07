package day22;

public class StringStartsEndsWith {

	public static void main(String[] args) {

		String word1= "eclipse";
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("eCC"));
		System.out.println(word1.endsWith("se"));
		
		String name="Mrs white";
		if (name.startsWith("Mr.")){
			System.out.println("married man");
		}else if(name.startsWith("Mrs.")){
			System.out.println("married mwomen");	
				
		}else if(name.startsWith("Ms.")) {
			System.out.println("some mwomen");	
			
		}else if(name.startsWith("Dr")){
			System.out.println("some mwomen");	

		}
		
		
		
		
		
		
	}		
	

}
