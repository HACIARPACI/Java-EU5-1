package day23StringManupulatinCont;

import java.util.Random;

public class task85 {

	public static void main(String[] args) {

		Random rn= new Random();
		int dice1;
		int dice2;
		int comp=0;
		int hac�=0;
		for (int i = 0; i <10; i++) {
			dice1=rn.nextInt(6)+1;
			dice2=rn.nextInt(6)+1;
			if(dice1>dice2) {
				comp++;
			}else if(dice2>dice1) {
				hac�++;
			}	
		}if(hac�>comp) {
			System.out.println("hac�: "+hac�+" comp "+comp
					+" hac� is the winner ");
		}else {
			System.out.println("hac� : "+hac�+" comp "+comp+" comp is the winner");
		}
		
		
		
		
		
			
		}
		
		
		
	}

