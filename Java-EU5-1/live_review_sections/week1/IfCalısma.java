package week1;
import java.util.Scanner;
public class IfCal�sma {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ald���n�z notu giriniz = ");
//     int not= 77;
		int not=scan.nextInt();
     if (not<50) {
    	 System.out.println("you failed");
     }	 else if (not>50&&not<60) {
    	 System.out.println("D ald�n�z");
     
     }else if (not>60&&not<70) {
    	 System.out.println("c aldn�z");
     }else if (not>70&&not<80)  System.out.println("b ald�n�z");
     else if (not>80&&not<90) {
    	 System.out.println("a ald�n�z");
     }else {
    	 System.out.println("afferinnnn");
     }
    	 
     
	}

}
