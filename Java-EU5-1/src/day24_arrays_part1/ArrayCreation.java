package day24_arrays_part1;

public class ArrayCreation {

	public static void main(String[] args) {

		
		int score1=8;
		int score2=85;
		int score3=90;
		int score4=100;
		int score5=85;
		int avg=(score1+score2+score3+score4+score5);
		
		int[]scores=new int[5];
		scores[0]=80;
		scores[1]=85;
		scores[2]=90;
		scores[3]=100;
		scores[4]=50;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);

		
		int avarageScore=(scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5;
		System.out.println(avarageScore);
		
		System.out.println("**************************************************");
		
		
		// option -1
		int[]numbers; 
		numbers=new int[3];
		//option-2
		int[]number1=new int[4];
		float[]temp=new float[100];
		char[]letters=new char[40];
		long[]units=new long[50];     
		String words[]=new String[5];
		
		System.out.println(numbers[2]);// 0 is defalut value of int
		System.out.println(temp[83]); // default is 0,0
		System.out.println(words[3]);// defalut null
		System.out.println(units[49]);//long defalut  0       // içinde 50 deðer var 0 dan baslar
		
		
		
		
		
		
		
	}

}
