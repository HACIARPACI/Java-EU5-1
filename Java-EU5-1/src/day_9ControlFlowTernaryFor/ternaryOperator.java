package day_9ControlFlowTernaryFor;

public class ternaryOperator {

	public static void main(String[] args) {
	String result;
	int score=88;
/*	if(score>60) {
		result="pass";
	}else {
		result="fail";
	} */

		result= score>60 ? "pass" :"fail";
		System.out.println(result);
	//nested ternary	
	int x=5;
	System.out.println(x>2 ? x<4 ? 10:8:7);
		
		if(x>2) {
			if(x<4) {
				System.out.println(10);
			}
		else {
			System.out.println(8);
		}
	
	}else {
		System.out.println(7);
	}
		String sonuc;
		
		int haci=80;
		sonuc= haci>78 ? "b�y�k" :"k���k "; 
		System.out.println(sonuc);
		
		int alfa=36;
		System.out.println(alfa>35 ? alfa>40 ?  10 : 8:7);
		
		
		
		
		
		
}
}