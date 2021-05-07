package day13MethodsPart1;

public class Task60 {

	public static void main(String[] args) {
		calculator(9,6,"+");
	/*	calculator(6,3,"+");
		calculator(6,3,"-");
		calculator(6,3,"*");
		calculator(6,3,"/");
	}
	public static void calculator(int num1,int num2,String operator) {
	
		switch(operator) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case"/":
			System.out.println(num1/num2);
			break;*/
		}
		public static void calculator(int num1,int num2,String operation) {
			
			double result=0;
			switch(operation) {
			case "+":
				result=num1+num2;
				break;
			case "-":
				result=num1-num2;
				break;
				default:
					System.out.println("yanlýs operator");
			}
			System.out.println(result);
			
		
			
			
			
			
			
			
			
			
			
			
	}
	
}
