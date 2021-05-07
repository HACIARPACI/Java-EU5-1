package MyRepeatSheets;

public class deneme5 {

	public static void main(String[] args) {
		boolean x= lastDigit(7,77);
		System.out.println(x);
		
	}
	public static boolean lastDigit(int num1,int num2) {
		if(num1%10==num2%10) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
