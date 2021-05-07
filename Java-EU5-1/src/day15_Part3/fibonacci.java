package day15_Part3;

public class fibonacci {

	public static void main(String[] args) {

	/*	int count=18;
		int pre1=0;int pre2=1;
		System.out.println("fibonacci series of"+count+ "nujmbers");
		
		for (int i = 1; i < count; i++) {
			
			
			
			
			
			System.out.print(pre2 +" ");
			
			// on each iteration we are assigning second number to the first number and assigning the sum of last 2 numbers to second number
			int sumOfPrewTwo=pre1+pre2;
			pre1=pre2;
			pre2=sumOfPrewTwo;
			
		}*/
	int count=9;	
	int pre1=0;
	int pre2=1;
		for (int i = 0; i <count; i++) {
			
			System.out.print(pre2+" ");
			
			int sum=pre1+pre2;
			pre1=pre2;
			pre2=sum;
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

	
	
}
