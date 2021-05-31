package day36_staticClassMembers;

public class Calculator {
	int x;
	
	//instance variable yoksa class içinde static kullanırız objectten çağırmak için
	
	public static double plus (double num1,double num2) {
		
		return num1+num2;
	}
	public static  double minus(double num1,double num2) {
		
		return num1-num2;
		
	}
public static  double multiply(double num1,double num2) {
		
		return num1*num2;

}
//daha önce class içinde neden static kullanmadık örneği bu yukarda instance variale tanımlanırsa static e gerek yok
public int m1() {
	return x+4;
	
}
}