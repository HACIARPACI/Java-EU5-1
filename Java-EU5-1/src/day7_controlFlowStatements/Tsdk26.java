package day7_controlFlowStatements;

public class Tsdk26 {
//if statement
	public static void main(String[] args) {
		int num1,num2;
		num1=10;
		num2=15;
		if(num1==num2) {
			System.out.println("nums are equal");
		}
		if(num1!=num2) {
			System.out.println("nums are not equal");
	}	
		//if else statement
		int num1,num2;
		num1=10;
		num2=15;
		if(num1==num2) {
			System.out.println("nums are equal");
		}else {
			System.out.println("nums are not equal");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//task 27
		int hour=25;                                                      ;
		if(hour<12) {
		System.out.println("godmorningg");
		}
		if(hour>=12&&hour<15) {
		System.out.println("good afternoon");
		}
		if(hour>15) {
		System.out.println("good evening");
	}
		double price=100;
		int quantity=200;
		double revenue;
		double discount=0; // discount u parantez dsýýnda ilk-0- atamasý yapýlýr eger revenue 5000den kucukse 0 cýksýn diye önemlii
	     revenue=price*quantity;
		if(revenue>5000) {
			discount = revenue*0.1;											
			revenue=revenue-discount;				
								
		}			
			System.out.println(revenue);
			System.out.println(discount);
		
		
		
		
		
		
		
		
		
		
	}

}
