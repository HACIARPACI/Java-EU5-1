package day_8controlFlowSatatementsIfElse;

public class smallTasks2 {

	public static void main(String[] args) {
		//assign y to 20 if xis egerater 100 otherwise y to 0
		int x,y;
		y=1;
		x=2;
		if(x>100) {
			y=20;
		}
		else
		{
			y=0; 
		}
		System.out.println("y="+y);//sonun ayazdırılıp sonucun ne oldugunu görmek için
		
		//task2 write if else 1 to x if y=100 pther wise 0 to x
		if(y==100) {
			x=1;
		}
		else {
			x=0;
		}
		System.out.println("x is ="+x);
		// 3- if else 0to b and 1 to c if a<10 other wise  b=-99 c=0
		int a,b,c;
		a=56;b=1;c=4;
		if(a<10) {
			b=0;
			c=1;
		}else {
			b=-99;
			c=0;
		}
		System.out.println("b ="+b +"c="+c);
		// task 29 find the bigger number
		int num1=4;
		int num2=3;
		if(num1>num2) {
			System.out.println("num 1 is bigger");
		}else {
			System.out.println("num2 is bigger");
		}
		
		// task 30 find the number şs odd or even number
		int num =6;
		if(num%2==1) {
			System.out.println("num is odd number");
		}else {
			System.out.println("num is even number");
		}
		
		// task31 triangle if valid or not agles sum is 180
		int a1=60;
		int b2= 70;
		int c3=98;
		if((a+b+c)==180) {
			System.out.println("valid triangle");
		}else {
			System.out.println("not valid triangle");
		}
		
		
		
		
		
		
		
		
		
	}

}
