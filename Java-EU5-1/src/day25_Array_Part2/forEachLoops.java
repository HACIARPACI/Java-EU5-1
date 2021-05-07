package day25_Array_Part2;

public class forEachLoops {

	public static void main(String[] args) {
		String[] products= {"Timberland","Shirt",	"Watch","Bag","Shoes"};
		double[]prices= {120.0,12.99,300,25,67.89};
		
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}
		
		System.out.println("*****************************"); 
		
		
		for (String prod : products) {  // numarator olmadan sýran kullaným
			System.out.println(prod);
		}
		for (double d : prices) {
			System.out.println(d*10);
			
		}
		// print product items in reverse order
		
		for (int i =products.length-1 ; i >=0; i--) {
			System.out.println(products[i]);
			
		}
		
		
	}

}
