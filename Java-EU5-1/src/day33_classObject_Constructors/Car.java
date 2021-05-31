package day33_classObject_Constructors;

public class Car {

	String model;
	String make;
	int year;
	double mile;
	String color;
	
	// create constructor to assign values
	
	public Car() {
		model="honda";
		make="civic";
		year=2020;
		mile=5000;
		color="red";
	}
	/*
	public Car(String mo,String ma,int yr, double ml, String cl) {
		model=mo;
		make=ma;
		year=yr;
		mile=ml;
		color=cl;	
		
	}
	*/
	

	public Car(String model, String make, int year, double mile, String color) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}


	public String toString() {
		return "Car [model=" + model + ", make=" + make + ", year=" + year + ", mile=" + mile + ", color=" + color
				+ "]";
	}
	
	
	
	
	
	
	
}
