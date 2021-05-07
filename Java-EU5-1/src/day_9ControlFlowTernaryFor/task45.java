package day_9ControlFlowTernaryFor;

import java.util.Iterator;

public class task45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=46;
		int num2=45;
		int steps=0;
		for (steps = 0; steps <=5; steps++) {
			if(num1>num2) {
				System.out.println("num1 is geerster than num 2");
			}else if(num2>num1) {
				System.out.println("num2 is greater than num 1");
			}
		}
		int n1=10;
		int n2=55;
		for (int i = 1; i <=3; i++) {
			if(n1>n2) {
				System.out.println("n1 is bigger");
		}else {
			System.out.println("n2 is bigger");
		}
			
		}
		
		
		
		
		
	}

}
