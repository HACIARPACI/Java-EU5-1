package day25_Array_Part2;

public class ReturningArrays {

	public static void main(String[] args) {

	//	double[]values=getArray();
		
	for (double num : getArray() ) {
		System.out.print(num+" ");
		}
		
	//	System.out.println(values[1]); //  [D@7637f22  verir for ile yazdýr
		
	}

	
	public static double[] getArray() {
		
		
		double[]array = {1.2,2,3.6,4,5,6,7};
		return array;
	}
}
