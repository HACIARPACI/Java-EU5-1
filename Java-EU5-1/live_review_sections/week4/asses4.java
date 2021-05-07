package week4;


public class asses4 {

	public static void main(String[] args) {
// komb (7,2) 7!/(7-2)!*2! 
		
		
	int num1=7;	        
	int num2=2;
	
	int x=combination(num1,num2);	
	System.out.println(x);
	
	
}
	
	public static int combination(int num1,int num2) {
		
		int result= factoriel(num1)/(factoriel(num1-num2)*factoriel(num2));
		
		return result;
		
		
		
		
	}
	public static int factoriel(int sayı) {
		int sonuc=1;
		for (int i = 1; i <=sayı; i++) {
			sonuc*=i;
			
			

			
		}
		
		return sonuc;
		
	
	}
}
