package MyRepeatSheets;

public class Ýfstatement {
public static void main(String[]args) {
	int age =19;
	if(age>18) {
		System.out.println("you can vote");
	}
	
	int num1=48;
	int num2=28;
	int num3=1;
	if(num1>num2&&num1>num3) {
	System.out.println("num1 isthe greatest");
	
	}
	if(num2>num1&&num2>num3) {
		System.out.println("num2 isthe greatest");
	}
	if (num3>num1&&num3>num2) {
		System.out.println("num3 isthe greatest");
	}
	
	double sayý1 =28.9;
	double sayý2=66.8;
	if(sayý1==sayý2) {
		System.out.println("equal numbers");
	}
	if (sayý1!=sayý2){
		System.out.println("not equal");
	}
	
	int price,quantity;
	price=50;
	quantity=100;
	double revenue = price*quantity;
	double discount=0;
	if(revenue>5000) {
		discount=revenue*0.1;
		revenue=revenue-discount;
	}
		System.out.println("revenue is="+revenue);
	
	int a=-223;
	if(a%2==0) {
		System.out.println("a is even number");
	}else {
		System.out.println("a is odd number");
	}
	int numara=4;
	
	if(Math.abs(numara)>1){
		
	}
	
	
	
	
	
	
}
}