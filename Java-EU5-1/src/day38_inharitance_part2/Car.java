package day38_inharitance_part2;

public class Car extends Vehicle{

	int maxSpeed=180;
	
	
	
	public void display() {
		System.out.println("max speed :"+ super.maxSpeed);
		System.out.println("maks speed :"+maxSpeed); 
		
		
		
	}
	
	
}
