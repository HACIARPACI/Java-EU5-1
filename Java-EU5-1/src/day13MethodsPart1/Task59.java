package day13MethodsPart1;

public class Task59 {

	public static void main(String[] args) {
												//de�i�kenler burda tan�mlanablir
	
		payMethod(80,20); 
		payMethod(37, 38.78);
	}

	
	public static void payMethod(double hours, double hourlyPay) {
		double pay=hours*hourlyPay;
		System.out.println("�demeniz "+ pay);
	}
	

	}

