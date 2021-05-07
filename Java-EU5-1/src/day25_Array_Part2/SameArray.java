package day25_Array_Part2;

public class SameArray {

	public static void main(String[] args) {

		int[]array1= {2,4,5,6};
		int[]array2=array1;
		array1[0]=200;
		array2[3]=1000;
		
		System.out.println("array1 is :"); 
		
		for (int value : array1) {
			System.out.println(value);
		}
		System.out.println();
		System.out.println("array2: "); 
		for (int value : array2) {
			System.out.println(value);
		}
	}

}
