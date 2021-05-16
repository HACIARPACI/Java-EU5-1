package Day16ClassObject;

public class Car1 {
	String make;       //properties
	String model;
	int currentSpeed;
	String color;
	
	public void printCarInfo() {        //method
		String info="Car make["+ make+"],model["+model+"],color["+color+"],currentSpeed["+currentSpeed+"]";
		System.out.println(info);
	}
	
	public void showCurrentSpeed(int speedLimit) {
	if(currentSpeed<=speedLimit) {
		System.out.println(make+ " is driving at" +currentSpeed+" mph,following the speed limit-"+speedLimit);
	}else {
		System.out.println(make+" is driving"+currentSpeed+" mph, overfollowing the speed limit-"+speedLimit);
	}
		
	}
	
	public void drive() {              //method
		System.out.println(make+ "  "+model+" is driving...");
	}
	
	public void accelerate(int mph) {   //method
		currentSpeed=currentSpeed+mph;
	
	
	
	}
}
	
	

