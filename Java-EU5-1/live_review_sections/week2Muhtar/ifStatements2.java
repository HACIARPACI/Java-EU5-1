package week2Muhtar;

public class ifStatements2 {

	public static void main(String[] args) {

		int score=222;
		if(score>=0&&score<=100) {  //if score is valid
			if(score>=90) {
				System.out.println("exellent");
			}else if(score>=70) {                    //&& ile ikinci kosulu yazmýyor gerek yok!!!
				System.out.println("good");
			}else if(score>=60) {
				System.out.println("pass");
			}else  {
				System.out.println("fail"); 
			}} else {          // if score is not valid
			System.out.println("invalid score");
		}
		//hangi ay kaç gün örneði  
		
		int month=8;
		boolean month28Days=month==2;
		boolean month30days=month==4||month==6||month==9||month==11;
		boolean month31Days=!month28Days&& !month30days;
		
		if(month>=1&&month<=13) {
				if(month28Days) {
					System.out.println(28+"days");
				}else if(month30days) {
					System.out.println("30 days");
				}else {
					System.out.println("31 days");
				}
		}else {
			System.out.println("invalid number");
				
				
				}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
	


