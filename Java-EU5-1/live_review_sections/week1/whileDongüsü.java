package week1;

import java.util.Scanner;

public class whileDong�s� {

	public static void main(String[] args) {
		/*int i=10;
		while (i>0) {
			
			
			
			
			System.out.print("java");
			i-=2;
		}
System.out.println("d�ng� bitti"+i);*/
		Scanner scan= new Scanner(System.in);
		System.out.println("say�y� giriniz");
		 
		int sayi= scan.nextInt();
		int faktoriyel=1;
		while(sayi>=1) {
		faktoriyel=faktoriyel*sayi;	
		sayi--;
		
		}	
		System.out.println("fak"+faktoriyel);
		
		
		int number =1;
		while (number<5) {
			System.out.println("hrllo");
			number++;
		}
		
		
		
		
		
		
		
	}

}
