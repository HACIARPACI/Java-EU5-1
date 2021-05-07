package Day_18ReadingUserInput;

import java.util.Scanner;

public class Task_73forDeneme {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);

	
	
	
	
	
	int secretNum=10;
	int num;
	System.out.println("lütfen bir sayý giriniz"); 
	for (int i = 1; i >0 ; i++) {
			 num=scan.nextInt();
			if(num==secretNum) {
				System.out.println("buldunuz");
				break;
			}
		else {
			if(num>secretNum) {
	
				System.out.println("azaltýnýz");
			}else if(secretNum>num) {
				System.out.println("artýrýnýz");
			}
		}
		
	}

	}
	

	}
	
	
	
	
	
	
	
	
	
	
	
