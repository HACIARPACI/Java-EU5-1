package assignment8;

public class q14 {

	public static void main(String[] args) {

		
		truthTable(true,true,true);
		System.out.println(truthTable(true,false,true));
		
	}

	public static boolean truthTable(boolean a,boolean b, boolean c) {
		
		
		if((a==true&& b==true  ) || c==true){
			
			return true;
		}else {
			return false;
		}
		
		
		
		
	}
	
	
	
}
/*This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.*/