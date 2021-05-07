package day_8controlFlowSatatementsIfElse;

public class task_36Calukator {

	public static void main(String[] args) {
		/*int =4;
		double n1=2;
		double n2=4;
		switch(sonuc) {
		case 1:
			System.out.println("1 toplama"+(n1+n2));
			break;
		case 2:
		System.out.println("2 cýkarma"+(n1-n2));
		break;
		case 3 :
			System.out.println("3 carpma"+(n1*n2));
			break;
		case 4:
			System.out.println("4 bölme"+(n1/n2));
		}*/
		// ozzy nin yazdýðý; 
		int n1=10;
		int n2=15;
		String operator="*";
		int result=0;
		switch(operator) {
		case "+":
			result=n1+n2;
			break;
		case "-":
			result= n1-n2;
			break;
		case "*" :
			result=n1*n2;
			break;
		case "/" :
			result=n1/n2;
			break;
		default: 
			System.out.println("invalid oprator");
		}
		System.out.println("result ="+result);	
			
			
			
			
			
			
			
			
		
	}

}
