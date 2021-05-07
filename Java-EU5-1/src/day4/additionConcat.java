package day4;

public class additionConcat {

	public static void main(String[] args) {
		System.out.println(5+5+"hellowold");
		//oolean ve integer toplamaz error
		System.out.println(2+0+3+"cybertek");//5cyberteck
		System.out.println(2+0+3+"cybertek"+2+2+2+"cybertek"+5+5+5);//concatanete
		System.out.println(2+0+5+"cybertek"+(2+0+5));//parantezi öcelik alýr toplama yapar
		System.out.println((1+5+6));	
		System.out.println(2-(+2)+2);
		int kale=10;
		boolean hacý= true; 
		double gol=2.3;
		System.out.println(kale%gol);
		System.out.println(18%5);
		System.out.println(kale+gol);
		}

}
