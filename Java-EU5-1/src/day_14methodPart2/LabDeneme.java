package day_14methodPart2;

public class LabDeneme {

	public static void main(String[] args) {
	caught(85,true);

		
		//love6(4,10);	
		
	/*times("Hi",8);	
		

	}
public static void times(String message,int number) {
	
	while(number>=1) {
		System.out.print(message + " ");
		number--;
	}*/
	
	
	
/*}

	public static void love6(int num1,int num2) {
		
		if(num1==0||num2==0||(num1+num2==6)||(num1-num2==6||num2-num1==6)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}*/
		
		
		
	}
	
	public static void caught(int speed,boolean birthday) {
		if(birthday==true) {
			if(speed<=65) {
				System.out.println(0);
			}else if(speed>66&&speed<=85) {
				System.out.println(1);
			}else if(speed>85) {
				System.out.println(2);
			}
		}else {
			if(speed<=60) {
				System.out.println(0);
			}else if(speed>60&&speed<=80) {
				System.out.println(1);
			}else if(speed>80) {
				System.out.println(2);
		}
		
		
		
		
	}
	
	}
}









