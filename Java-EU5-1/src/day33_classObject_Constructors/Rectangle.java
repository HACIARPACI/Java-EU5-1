package day33_classObject_Constructors;

public class Rectangle {

	
	double length;
	double width;
	
	public void getArea() {
		
		System.out.println(width*length);
		
	}
//constructor     the same name with class and does nor have return type	
//create a constructor 2 args type double	
	public Rectangle(double a , double b) {
		length=a;
		width=b;
		
	}
	public Rectangle() {
		
		length=5.4;
		width=2.7;
	}
	public Rectangle(int a, float b) {
		
		
		
	}
	
}	
