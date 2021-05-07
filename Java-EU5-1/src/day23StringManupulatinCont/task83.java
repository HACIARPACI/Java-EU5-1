package day23StringManupulatinCont;

import java.util.Random;
import java.util.Scanner;

public class task83 {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
		Random rn=new Random();
		
	int dice1;
	int dice2;
	String again="y";
		
	while(again.equalsIgnoreCase("y")) {
		System.out.println("rolling dice");
		dice1=rn.nextInt(6)+1;
		dice2= rn.nextInt(6)+1;
		
		System.out.println("their values are :");
		System.out.println(dice1+" "+dice2);
		
		System.out.println("roll them again (y=yes)??");
		again=scan.nextLine();
		
	}
	
	
	
	
	
	
	
		
	}

}
