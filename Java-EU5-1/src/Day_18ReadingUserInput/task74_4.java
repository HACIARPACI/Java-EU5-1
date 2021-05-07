package Day_18ReadingUserInput;

import java.util.Scanner;

public class task74_4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int sum=0;
		//int sayý;
		
		do {
			System.out.println("sayý gir");
	          int	sayý=scan.nextInt();
		if (sayý>0) {
			sum=sayý+sum;
			}else {
				break;
			}
		
	}while(true);
System.out.println("girilen pozitif sayýlarýn toplamý:"+sum);
	
}
}
