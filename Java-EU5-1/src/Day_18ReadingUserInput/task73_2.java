package Day_18ReadingUserInput;

import java.util.Scanner;

public class task73_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int gizliSayý=5;
		int num=0;
		System.out.println("lütfen bir sayý giriniz");
		do {
			num=scan.nextInt();
			if(num==gizliSayý) {
				System.out.println("buldunuz");
				break;
			}
			if(num>gizliSayý) {
				System.out.println("azaltýnýz");
			}else if(num<gizliSayý) {
				System.out.println("artýrýnýz");
			}
			
			
			
			
		}while(num!=gizliSayý);
		
		
		
		
		
	}

	

	
}
