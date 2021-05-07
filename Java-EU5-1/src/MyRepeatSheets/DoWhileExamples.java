package MyRepeatSheets;

import java.util.Scanner;

public class DoWhileExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in)	;
		
		int top,input;
		input=1;
		top=0;
		do {
			System.out.println("sayo giriniz");
			input=scan.nextInt();
			if(input%2==0) {
				top+=input;
			}
			
			
		}while(input>0);
		System.out.println("girilen çift5 sayýlarýn toplamý"+input);
		
		
	}

}
