package day22;

public class Circle {
	
	public double radius;  //bu package d�s��da da ula��lab�ilmesi i�in public koydu koymasa da olur
	
	double calculateArea() {
		return radius*radius*3.14;
		
	}
	public double calculatePerimeter() {
	return 2*3.14*radius;
	
	}
	public String toString() { // to execute automatically
		return "Radius: " + radius+", Area:"+calculateArea()
		+", Perimeter: "+calculatePerimeter();
	}
	
}
