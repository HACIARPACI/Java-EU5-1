package Day_18ReadingUserInput;

import java.util.Scanner;

public class task74_4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int sum=0;
		//int say�;
		
		do {
			System.out.println("say� gir");
	          int	say�=scan.nextInt();
		if (say�>0) {
			sum=say�+sum;
			}else {
				break;
			}
		
	}while(true);
System.out.println("girilen pozitif say�lar�n toplam�:"+sum);
	
}
}
