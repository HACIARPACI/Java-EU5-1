package day_17classObjectsPart2;

public class carObjects {

	public static void main(String[] args) {
 
		
		
	BMW b1= new BMW();
	BMW b2= new BMW();
    
    
    System.out.println(b1.make);
	System.out.println(b2.make);
	
	b1.make="2019BMW";
	System.out.println(b1.make);
	System.out.println(b2.make);
	b1.model="m3";
	b1.showPrice();
	b1.model="X3";
	b1.showPrice();
	}

}
