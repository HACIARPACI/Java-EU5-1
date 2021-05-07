package day27_ArraysPart4;

import java.util.Arrays;

public class Pizza2DArray {

	public static void main(String[] args) {

		String[][]pizzas= {{"pineapple","pepperoni"},
				{"anchinove","mushroom","olives"},
				{"4 cheese"},
				{"chickm","tomato","onion"},
				{"grren peer","zuccine","brocoli","spinach","shrimp"}};
		
	//	System.out.println(Arrays.toString(pizzas[0]));
		for (String[] pizza : pizzas) {
			System.out.println(pizza.length+"-");
			System.out.println(Arrays.toString(pizza)); 
		}
		
		System.out.println("######for iterator loop");
		
		
		for (int i = 0; i < pizzas.length; i++) {
			System.out.println(pizzas[i].length); 
		
				System.out.println(Arrays.toString(pizzas[i])); 
			}
		
		for (String chicken : pizzas[3]) {
			System.out.println(chicken);
		}
		
		
		int[][]students= {{4,5,6},{12,5,7},{23,56,12,55,3}};
		
		for (int[]group:students) {
			
			for (int studentID : group) {
				
				System.out.println(studentID); 
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
		
		
	


