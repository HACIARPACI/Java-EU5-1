package Lab3;

public class question1 {

	public static void main(String[] args) {

//	String message =helloName("BoB");	
	String message =helloName("Alice");
//	String message =helloName("Evin");
		System.out.println(message);
		
		
	}
	public static String helloName(String name) {
		
		return "Hello ".concat(name);
		
	 
	}

}
