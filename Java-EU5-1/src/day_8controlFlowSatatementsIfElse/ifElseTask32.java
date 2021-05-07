package day_8controlFlowSatatementsIfElse;

public class ifElseTask32 {

	public static void main(String[] args) {
		//task32 largest number
		int num1 =100;
		int num2=200;
		int num3=300;
		if((num1>num2&&num1>num2)) {
			System.out.println("num1 isthe greatest");
		}else if((num2>num1&&num2>num3)){
			System.out.println("num2 isthe greatest");
	}else if((num3>num1&&num3>num2)) {
		System.out.println("num3 isthe greatest");
	}else {
	 System.out.println("they are equal");
	}
	//task33 
		int marks=99;
		if(marks<60) {
			System.out.println("faileed");
		}else if(marks>=60 &&marks<=90){
			System.out.println("passed");
		}else if (marks>90) {
			System.out.println("passed with distinction");
		}else {
			System.out.println("invalid score");
		}
		
	//TASK 34  AVARAGE GRADIND
			int math=20;
			int chem=70;
			int bio=89;
			double avarage=(math+chem+bio)/3;
			if (avarage>0&&avarage<=59) {
				System.out.println(	"grade is f");
			}else if(avarage>=60&&avarage<=69){
				System.out.println(	"grade is d");
			}else if(avarage>=70&&avarage<=79) {
				System.out.println(	"grade is c");
			}else if(avarage>=80&&avarage<=89){
				System.out.println(	"grade is b");
			}else if(avarage>=90&&avarage<=100) {
				System.out.println(	"grade is a");
			}
			System.out.println("avarage is="+avarage);
	
					
					
					
					
					
					
					
					
					
					
					
	
	
	
	}
}
