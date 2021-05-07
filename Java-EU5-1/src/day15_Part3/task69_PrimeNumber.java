package day15_Part3;

import java.util.Iterator;

public class task69_PrimeNumber {

	public static void main(String[] args) {
	int num=47;
		
		
		if(isPrime(num)) {
			System.out.println(num+" is prime number");
		}else {
			System.out.println(num+"is not a prime nuýmber ");
		}
		
		
	}
	public static boolean isPrime(int num) {
		
		boolean flag =true;
		
		if(num==0||num==1) {
			//false
			flag=false;
			
}	else {   
	for (int i=2 ; i < num; i++) {
		if (num%i==0) {
			flag=false;
			//false
			break;
		}
		
      }
	
    }
	return flag;
		//true
		
		
}
		
	}
	

