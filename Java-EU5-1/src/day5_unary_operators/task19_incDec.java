package day5_unary_operators;

public class task19_incDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		a= --a + a++ + a-- + a++;
		System.out.println("a="+a);// 49+49+50+49
		
		int b=1;
		b= -b-- + b++ / -b-- *--b;// son iþlemi sor
		System.out.println(b);
	}

}
