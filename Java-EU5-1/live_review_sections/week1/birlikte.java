package week1;


import java.util.Scanner;

public class birlikte {

	public static void main(String[] args) {
		/*Kullan�c�dan say� al�n ve o say� kadar ard arda gelen fibonacci say�
        * dizisini ekrana yazd�r�n
        * �rnek : Kullan�c� 10 say�s�n� girdi, 10 tane say�y� ekrana yazd�raca��z.
        *            0 1 1  2  3  5 8 13 21 34*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("l�tfen bir say� giriniz"); 
		int say�= scan.nextInt();
		int toplam=1;
		
		for (int i = 0; i <= say� ; i++) {
			toplam=toplam+i; 
			System.out.print(toplam+" ");
		}
			
		}
		
		
		
		
		
		
		
			
		

	}


