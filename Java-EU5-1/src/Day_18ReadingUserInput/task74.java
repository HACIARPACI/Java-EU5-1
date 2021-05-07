package Day_18ReadingUserInput;

import java.util.Scanner;

public class task74 {

	public static void main(String[] args) {
		int sum=0;
		int num=0;
		Scanner scan=new Scanner(System.in);
		
		
		
		do {
			
		System.out.println("enter your number");
		num=scan.nextInt();
		if(num<0) {
			break;
		}else {
			sum+=num;
		}
		
		
		
		
		
		}while(true);
		System.out.println("total is:"+sum);
		
	}
	
	
	
	

}
