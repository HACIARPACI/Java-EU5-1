package day22;

public class Circle {
	
	public double radius;  //bu package dýsýþda da ulaþýlabþilmesi için public koydu koymasa da olur
	
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
