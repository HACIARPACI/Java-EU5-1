package Week3;

public class customPractice {

	public static void main(String[] args) {

		System.out.println(isEven(150));
		System.out.println(factorialNumber(6));
		
	}

	public static boolean isEven(int number) {
	
		return (number%2==0)? true:false;
		
		
	}
	
	public static int factorialNumber(int number) {
		int result=1;
		while(number>0) {
		result*=number;
		number--;
		}
		return result;
	}
}
