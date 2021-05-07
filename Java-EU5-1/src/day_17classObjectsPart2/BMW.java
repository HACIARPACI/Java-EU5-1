package day_17classObjectsPart2;

public class BMW {

	String make;
	String model;
	double price;
	
	
	public void showPrice() {
		
		switch(model) {
		case "330i":
			price=40250;
		case "740i":
			price=85000;
		case "m3":
			price=65000;
			break;
			default:
				System.out.println(model+" is not available");
				price=0.0;
		}
		System.out.println("price is :"+price);
	}
}
