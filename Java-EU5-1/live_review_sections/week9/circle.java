package week9;

public class circle {

	private double radius;
	
	
	
	public circle(double radius) {
		this.radius = radius;
	}

	
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius<=0) {
			System.err.println("invalid radius value");
			return;
		}
		this.radius = radius;
	}




	public double gerArea() {
		
		return Math.pow(radius, 2)*Math.PI;
		
	}

	public double getPerimeter() {
		
		
		return radius*2*Math.PI;
	}

	@Override
	public String toString() {
		return "circle [radius=" + radius + ", gerArea()=" + gerArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}


	
	
	
}
