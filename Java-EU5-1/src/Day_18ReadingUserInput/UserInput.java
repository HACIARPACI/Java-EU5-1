package Day_18ReadingUserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a byte value");
		byte b1=scan.nextByte();
		System.out.println("byte value is :"+b1);
		
		System.out.println("enter another short value");
		short s1=scan.nextShort();
		System.out.println(s1);
		
		System.out.println("enter an int value");
		int i1= scan.nextInt();	
		System.out.println("int value is: "+i1);
	
		System.out.println("entera long value");
		long l1= scan.nextLong();
		System.out.println("long value is :"+l1);
	
		System.out.println("entera double value");
		double d1= scan.nextDouble();
		System.out.println("double value is :"+d1);
		
		System.out.println("entera boolean value");
		boolean bool= scan.nextBoolean();
		System.out.println("boolean value is :"+bool);
		
		System.out.println("isim giriniz");
		String isim= scan.nextLine();
		System.out.println(isim);
	}
}
