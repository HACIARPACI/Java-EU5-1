package assignment8;

public class q7 {

	public static void main(String[] args) {

	

	System.out.println(isPalendrome(1001                ));
	
		
	}

	public static boolean isPalendrome(int num) {
		int binler =num/1000;
		int yüzler =(num/10)%10;
		int onlar =(num/100)%10;
		int birler=num%1000;
		if(binler==birler&&yüzler==onlar) {
			return true;
		}else {
			return false;
		}

	
}

}		
	
	






/*Complete a method isPalindrome() that will check if the number is a palindrome.
 Print your result as a boolean (true or false).
 */
/*Do not convert int into a string!
Example:
input: 1001
output: true

Example:
input: 1234
output: false*/