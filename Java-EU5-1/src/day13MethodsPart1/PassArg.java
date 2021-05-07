package day13MethodsPart1;

public class PassArg {

	public static void main(String[] args) {
		short x=10;
		displayValue((int)x);
		displayValue(x/5);
	
	}

	public static void displayValue( int num1){ {        //num lar ayný olmak zorun da! //double yapabiliriz
		System.out.println("the value is"+num1);        //10
		
	}
	}
}