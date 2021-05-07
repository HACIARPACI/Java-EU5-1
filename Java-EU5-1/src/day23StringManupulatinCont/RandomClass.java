package day23StringManupulatinCont;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {

		
		Random rn=new Random();
		
		System.out.println(rn.nextInt());
		System.out.println(rn.nextDouble());
		System.out.println(rn.nextFloat());
		System.out.println(rn.nextBoolean());
		System.out.println(rn.nextInt(50));
		System.out.println(rn.nextInt(10)+5);//0-9 //5-14için +5
	int x=rn.nextInt(100);
	System.out.println(x);
		
	}

}
