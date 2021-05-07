package MyRepeatSheets;

import java.util.Scanner;

public class whileExamples {

	public static void main(String[] args) {
		
	/*	int sayý=1;
		while(sayý<=100) {
			if(sayý%2==0) {
				System.out.print(sayý+" ");
			}
			sayý++;
		}*/
	 //güzel örnek
	Scanner scan=new Scanner(System.in);
	/*int top=0;
	int input;
	while(true) {
		System.out.println("lütfen bir sayý girniz");
		input=scan.nextInt();
		if(input<0) {
			System.out.println("negatif sayý girdiniz program bitti");
			break;
			
		}
		if(input%2==1) {
			top+=input;
		
		}
	}
	
	System.out.println("girilen tek sayýlarýn toplamý"+top);
		*/
		/* þýk bir örnek
		System.out.println("sayý giriniz");
		int input=scan.nextInt();
		int k=1;
		while(k<=input) {
			System.out.println(k); 
			k=k*2;
		}*/
		
		//faktoriyel hesaplama
		/*System.out.println("fak sayý girniz");
		int fak= scan.nextInt();
		int sonuc=1;
		while(fak>0) {
			sonuc=sonuc*fak;
			fak--;
		}
		System.out.println(sonuc);*/
		
		// harmonik sayýlar   1+1/2+1/3
	/*System.out.println("harmonik sayýsý giriniz");
		double h=scan.nextDouble();
		double harmon=0.0;
		while(h>0) {
			harmon+=(1/h);
			h--;
		}
		System.out.println(harmon);*/
		
		//yýldýz örneði 
	
	
	int star=scan.nextInt();
	
		
		
		
		
		

	}

}
