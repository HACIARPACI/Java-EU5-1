package day5_unary_operators;

public class mixedInteger {

	public static void main(String[] args) {
		int i1=5;
		int i2 = 10;
		float f1= 15.5f;
		double d1 =20.5;
		//minimum int olmalý
		int res1= i1+i2;
		//minimum float olmalý
		float res2= i1+f1;
		//min double olabilir
		double  res3=i2+d1;
		// two short addition int must be min yada castingle short olabilir.
		short firstNumber=10;
		short secondNumber=20;
		int thirdNumber=firstNumber+secondNumber;
		//byte byte iþleminde otomatik int olur yada casting le byte olur
		byte b1=20
		byte b2=2;
		int b3=b1*b2;// byte b3=(byte)(b1*b2);
		
		int h1=20;
		int y1= 30;
		byte res=(byte)(b1+b2);
		
		
		
		

	}

}
