package day35encapsulation;

public class CarpetTest {

	public static void main(String[] args) {
/*	Floor f =new Floor(10,20);
		Carpet c = new Carpet(5.2);
		Calculator cal = new Calculator(f,c); // need parameters? objetct sbelongs to floor and carpect class
		System.out.println(cal.getTotalCost());*/
		
	
		Calculator cal=new Calculator(new Floor(10,20), new Carpet(5.2));
		System.out.println(cal.getTotalCost());
		
	}

}
