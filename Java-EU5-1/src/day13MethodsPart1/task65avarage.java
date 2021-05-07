package day13MethodsPart1;

public class task65avarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		avarage(11,10,100);
		
	}

	public static void avarage(int n1,int n2,int n3) {
		double avarage=(n1+n2+n3)/3;
		if(avarage<=100&&avarage>0) {
			if(avarage>=90) {
				System.out.println("grade A");
			}else if(avarage>=80){
				System.out.println("grade B");
			}else if(avarage<=79){
				System.out.println("cok calıs");
			}else {
				System.out.println("invalid note"); 
				
			}
			
			
			
			
			
		}
		
		
		
	}
	
}
