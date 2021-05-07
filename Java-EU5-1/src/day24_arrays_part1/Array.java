package day24_arrays_part1;

public class Array {

	public static void main(String[] args) {

	/*	int[]myList= {10,20,30,40};/// kýsa yol önce deklare sonra tek tek yazmaya gerek yok
		String[]myArray= {"orange","apple","cucumber"};
		System.out.println(myList[0]);
		System.out.println(myList[2]);
		
		System.out.println(myList.length);
		System.out.println(myArray.length);
		
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i]);*/
			
			
		
		int sum =0;
		int []scores= {80,45,65,87,65,32,45,78,54,12,65,155,54,13};
			for (int i = 0; i < scores.length; i++) {
				 sum+=scores[i];
			}
			System.out.println("total elemnt on array is :"+scores.length);
			 System.out.println("avarage: "+sum/scores.length);

		
		
		
		
		
		
		
		
}
		
		
		
		
		
	}


