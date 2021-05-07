package day_9ControlFlowTernaryFor;

import java.util.Iterator;

public class task42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sumEven=0;
	int sumOdd=0;
	for (int i = 1; i <100; i++) {
		if(i%2==0) {
			
			sumEven=sumEven+i;
		//	System.out.println("sum of even numbers "+sumEven); buraya yazarsak her loopta toplamýný görürüsün
			// o yüzden paranteazin dýþýna yazmak lazým genel toplamý görmek için
		}else {
		
			sumOdd=sumOdd+i;
		}
	}
	System.out.println("sum of even numbers "+sumEven);
	System.out.println("sum of odd numbers "+sumOdd);
	
	
	 int tektop=1;
	 int cifttop=2;
	 for (int i = 1; i <100; i++) {
		if(i%2==1) {
			tektop+=i;
		}else {
			cifttop+=i;
		}
	}
	 
	 System.out.println(tektop+" "+cifttop);
	 
	 
	 
}	
	}


