package week5;

import java.util.Scanner;

public class formatFirstLastName {

	public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your first name");
 /*      String f=scan.next() ;
       f=f.substring(0, 1).toUpperCase()+f.substring(1).toLowerCase();
       System.out.println(f);*/
		
		String f=scan.next().toUpperCase();
		f=f.charAt(0)+f.substring(1).toLowerCase();     //charAr(0).touppercase yapamazsýn !!!! char to string olmaz 
		
		System.out.println("enter your last name ");
		String l= scan.next();
		l=l.substring(0,1).toUpperCase()+l.substring(1).toLowerCase();
		
		System.out.println(f+" "+l);
		
	}

}
