package day13MethodsPart1;

import java.util.Iterator;

public class Task64 {

	public static void main(String[] args) {

		
		
		starShape(6);
	}

	public static void starShape(int k) {
		
		for (int i = 1; i <k; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
