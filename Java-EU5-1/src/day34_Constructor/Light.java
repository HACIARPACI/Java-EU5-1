package day34_Constructor;

public class Light {

	
	int noOfWatts;
	boolean indicator;
	String location;
	//1
	public Light() {
		this(0,false);
		System.out.println("retuerning from no arg constructor no.1");
			
	}
	//2
	public Light(int watt, boolean ind) {
		this(watt,ind,"Turkey");
		System.out.println("retuerning from no arg constructor no.2");
	
	}
	//3
	public Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		
		System.out.println("retuerning from no arg constructor no.3");

	}
	

}
