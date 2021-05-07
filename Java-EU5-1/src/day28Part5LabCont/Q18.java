package day28Part5LabCont;

public class Q18 {

	public static void main(String[] args) {

		int[]x= {13,1,2,5,6,2,1,13};
		System.out.println(lucky13(x));
		
		
	}
	public static int lucky13(int []numbers) {
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==13) {     //if(x[i]!=13   dersen daha þýk olur!!
				continue;
			}
			sum+=numbers[i];
			
		}
		return sum;
		
		
	}
	

}
