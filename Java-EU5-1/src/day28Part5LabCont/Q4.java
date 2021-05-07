package day28Part5LabCont;

public class Q4 {

	public static void main(String[] args) {

		int[]x= {1,5,9};
		int[]y={7,12,100};
		System.out.println(sum(x));
		System.out.println(sum(y));
	
	}
public static int sum(int []numbers) {
	
	int sum =0;
	/*for (int i = 0; i < numbers.length; i++) {
		sum+=numbers[i];
	}
	return sum;*/
	
	
	for (int value : numbers) {
		sum+=value;
	}
	
	return sum;
	
}
}
