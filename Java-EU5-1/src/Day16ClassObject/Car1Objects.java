package Day16ClassObject;

public class Car1Objects {

	public static void main(String[] args) {

	Car1 car1= new Car1();
	car1.printCarInfo();
	car1.make="ford";
	car1.model="fiesta";
	car1.color="grey";
	car1.currentSpeed=55;
	
	car1.printCarInfo();
	
	car1.showCurrentSpeed(100);
	car1.showCurrentSpeed(30);
	car1.drive();
	System.out.println("before"+car1.currentSpeed);
	car1.accelerate(20);
	System.out.println("after:"+car1.currentSpeed);	
	}

	
	
}
