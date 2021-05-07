package day13MethodsPart1;

public class Task59 {

	public static void main(String[] args) {
												//deðiþkenler burda tanýmlanablir
	
		payMethod(80,20); 
		payMethod(37, 38.78);
	}

	
	public static void payMethod(double hours, double hourlyPay) {
		double pay=hours*hourlyPay;
		System.out.println("ödemeniz "+ pay);
	}
	

	}

