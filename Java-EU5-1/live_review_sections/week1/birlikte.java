package week1;


import java.util.Scanner;

public class birlikte {

	public static void main(String[] args) {
		/*Kullanýcýdan sayý alýn ve o sayý kadar ard arda gelen fibonacci sayý
        * dizisini ekrana yazdýrýn
        * örnek : Kullanýcý 10 sayýsýný girdi, 10 tane sayýyý ekrana yazdýracaðýz.
        *            0 1 1  2  3  5 8 13 21 34*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir sayý giriniz"); 
		int sayý= scan.nextInt();
		int toplam=1;
		
		for (int i = 0; i <= sayý ; i++) {
			toplam=toplam+i; 
			System.out.print(toplam+" ");
		}
			
		}
		
		
		
		
		
		
		
			
		

	}


