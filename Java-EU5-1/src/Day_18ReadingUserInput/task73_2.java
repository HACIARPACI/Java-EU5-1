package Day_18ReadingUserInput;

import java.util.Scanner;

public class task73_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int gizliSay�=5;
		int num=0;
		System.out.println("l�tfen bir say� giriniz");
		do {
			num=scan.nextInt();
			if(num==gizliSay�) {
				System.out.println("buldunuz");
				break;
			}
			if(num>gizliSay�) {
				System.out.println("azalt�n�z");
			}else if(num<gizliSay�) {
				System.out.println("art�r�n�z");
			}
			
			
			
			
		}while(num!=gizliSay�);
		
		
		
		
		
	}

	

	
}
