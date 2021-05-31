package day34_Constructor;

public class AppleTest {
	public static void main(String[] args) {	
		
		Apple  a1 = new Apple();
		changeApple(a1);
		System.out.println(a1.color);
		
		System.out.println(methodObject().color);
		
		
		
	}

	public static void changeApple(Apple a1) {
	a1.color="White";
		
	}
	
	// i want to return object
	public static Apple methodObject() {
		
		Apple b1= new Apple();
		return b1;
		
	}
	
	
	
	
}
