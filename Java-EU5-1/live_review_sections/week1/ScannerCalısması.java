package week1;
import java.util.Scanner;

public class ScannerCal�smas� {
 public static void main(String[]args) {
Scanner scan = new Scanner(System.in);
int say�1,say�2,secim;
System.out.println("ilk say�y� giriniz:");
say�1=scan.nextInt();
System.out.println("ikinci say�y� giriniz:");
say�2=scan.nextInt();
System.out.println("yapmak istedi�iniz islemi seciniz:\n1-toplama\n2-c�karma\n3-carpma\n4-b�lme");
secim=scan.nextInt();
switch(secim) {
case 1:
	System.out.println("sonu�"+(say�1+say�2));
break;
case 2:
	System.out.println("sonuc"+(say�1-say�2));
break;
case 3:
	System.out.println("sonuc"+(say�1*say�2));
	break;
case 4 :
	System.out.println("sonuc"+(say�1/say�2));
	break;
	default:
		System.out.println("l�tfen gecerli bir say� giriniz");
	
	
}
 
 
 
 
 

	}
}
