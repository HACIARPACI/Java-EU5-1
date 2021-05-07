package day28Part5LabCont;

public class Q16 {

	public static void main(String[] args) {

		int[]x= {2,4,5,8,0,9,6,5,2,3,4,7,5,8,5};
		int[]y= {3,5,7,9};
		System.out.println(even(y));
	}
public static int even(int []nums) {
	
	int total=0;
	for (int value : nums) {
		if(value%2==0) {
			total++;			
	} 		
}
	return total;	

}
}


