package week1;
import java.util.Scanner;

public class ScannerCalýsmasý {
 public static void main(String[]args) {
Scanner scan = new Scanner(System.in);
int sayý1,sayý2,secim;
System.out.println("ilk sayýyý giriniz:");
sayý1=scan.nextInt();
System.out.println("ikinci sayýyý giriniz:");
sayý2=scan.nextInt();
System.out.println("yapmak istediðiniz islemi seciniz:\n1-toplama\n2-cýkarma\n3-carpma\n4-bölme");
secim=scan.nextInt();
switch(secim) {
case 1:
	System.out.println("sonuç"+(sayý1+sayý2));
break;
case 2:
	System.out.println("sonuc"+(sayý1-sayý2));
break;
case 3:
	System.out.println("sonuc"+(sayý1*sayý2));
	break;
case 4 :
	System.out.println("sonuc"+(sayý1/sayý2));
	break;
	default:
		System.out.println("lütfen gecerli bir sayý giriniz");
	
	
}
 
 
 
 
 

	}
}
