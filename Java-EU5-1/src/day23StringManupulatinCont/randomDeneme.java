package day23StringManupulatinCont;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class randomDeneme {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		Random rn=new Random();
		
		for (int i =1 ; i <=5; i++) {
			System.out.println("please enter a number between 1-6");
		int num= scan.nextInt();
			int num2=rn.nextInt(6)+1;
			System.out.println(num2);
			if (num==num2) {
				System.out.println("bildiniz");
				break;
			}
		}
		
		
		
		
	}

}
