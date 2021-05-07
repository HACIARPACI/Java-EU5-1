package week1;

import java.util.Iterator;

public class ownLoopWork {  //task47

	public static void main(String[] args) {
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j <=6; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
			
		//task48
		for (int i = 0; i <=6; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
			
		//task49
		
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			System.out.println("#");
		}
			
		//task 50
		
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
			//task52
		int i=25;
		while(i>10) {
			System.out.println("in the loop");
			i--;
		}
	//	task 53
		
		int a =1;
		int sumEven=0;
		while(a<=100) {
			if(a%2==0) {
				sumEven+=a;
			}
			a++;
		}
		System.out.println(sumEven);
		
	// do while
		int c=30;
		
		do {
			System.out.println(c);
			i++;
		}while(c<20);
		
		
		
		
		
		
		
		
		
	}
}

