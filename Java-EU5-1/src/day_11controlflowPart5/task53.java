package day_11controlflowPart5;

public class task53 {

	public static void main(String[] args) {
		
	int num=0;
	int sumEven=0;
	while(num<100) {
		if(num%2==0) {
			sumEven+=num;
		}
		num++;
	}
	System.out.println(sumEven);
	}
}
