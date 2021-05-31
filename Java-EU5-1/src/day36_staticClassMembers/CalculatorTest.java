package day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {

		double result=Calculator.plus(55,7);
		System.out.println("Result : "+result);
		
	
		
		Calculator c= new Calculator();
		System.out.println(c.plus(55, 7));
		
		int i=Integer.parseInt("33");
		System.out.println(Character.isDigit('5'));
		
		/*Calculator a= new Calculator();
		int x= a.m1();
		System.out.println(x);*/
		
		
		
	}
	public static void m1() {
		System.out.println("heloo");
	}
	public static void m2() {
		
		
		System.out.println("java");
	}
	

}
