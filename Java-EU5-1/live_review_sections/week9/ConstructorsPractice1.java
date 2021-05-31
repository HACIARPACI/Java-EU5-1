package week9;

public class ConstructorsPractice1 {

	
	
	public ConstructorsPractice1() {
	System.out.println("a");
		
	}
	public ConstructorsPractice1(int a) {
		this();//a 
		System.out.println("b");	
	}
	 
	public ConstructorsPractice1(String a) {
		
		this();
		System.out.println("b");
		
	}

	public static void main(String[] args) {		
		new ConstructorsPractice1(10);
		
	}
	
	
	public void method1() {			
		method1();
    System.out.println("A");		
	}
	
	
	public void method2() {	
		this.method1();
		System.out.println("B");
		
	}
	
}
