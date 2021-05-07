package week1;
import java.util.Scanner;
public class switchStatementOrnegi {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("lütfeniþlem yapmak istediðiniz iþlem numarasýjý seçiniz \n 1-toplama\n2-cýkarma\n 3-bölme");
		
		//int islem=2;
		int islem= scan.nextInt(); 
		switch(islem) {
		case 1:
			System.out.println("toplama iþlemi");
			break;
		case 2:
			System.out.println("çýkarma iþlemi");
			break;
		case 3: 
			System.out.println("bölme iþlemi iþlemi");
			break;
			default:
				System.out.println("iþlem numarasýný doðru seçiniz");
		}
		}

	}


