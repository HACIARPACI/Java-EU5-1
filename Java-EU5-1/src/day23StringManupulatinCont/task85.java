package day23StringManupulatinCont;

import java.util.Random;

public class task85 {

	public static void main(String[] args) {

		Random rn= new Random();
		int dice1;
		int dice2;
		int comp=0;
		int hacý=0;
		for (int i = 0; i <10; i++) {
			dice1=rn.nextInt(6)+1;
			dice2=rn.nextInt(6)+1;
			if(dice1>dice2) {
				comp++;
			}else if(dice2>dice1) {
				hacý++;
			}	
		}if(hacý>comp) {
			System.out.println("hacý: "+hacý+" comp "+comp
					+" hacý is the winner ");
		}else {
			System.out.println("hacý : "+hacý+" comp "+comp+" comp is the winner");
		}
		
		
		
		
		
			
		}
		
		
		
	}

