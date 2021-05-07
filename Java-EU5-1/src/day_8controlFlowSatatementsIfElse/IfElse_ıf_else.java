package day_8controlFlowSatatementsIfElse;

public class IfElse_ıf_else {

	public static void main(String[] args) {
		//display 1monday 2 tuesday 3wednesday 4thursday 5friday 6saturday 7sunday
		int day =(25%8);
		
		if(day==1) {
			System.out.println("monday");
		}else if(day==2){	
			System.out.println("tuesday");
		}else if(day==3) {
			System.out.println("wednesday");
		}else if(day==4) {
			System.out.println("thursday");
		}else if(day==5) {
			System.out.println("friday");
		}else if(day==6) {
			System.out.println("saturday");
		}else if(day==7) {
			System.out.println("sunday");
		}else {
		System.out.println("not valid day");
	}
		
		// yas ve okul örneği
	int age =48;
	if(age<2||age>18) {
		System.out.println("ineligeble");
	}else if(age==2) {
		System.out.println("toddler");
	}else if(age>3&&age<5) {
		System.out.println("early childhood");
	}else if(age>=8&&age<=10){
		System.out.println("elementary");
	}else if (age>14&& age<=16 ){
		System.out.println("highschool");
		
	}else {
		System.out.println("not valid age");
	}
		
		
		
		
		
		
		
		
		
		
		
   }
}