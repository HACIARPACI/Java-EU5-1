package week1;
import java.util.Scanner;

public class caseSerbestCalýsma {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("1-2yada 3 ü giriniz: ");
        int sayý=scan.nextInt();
        switch(sayý) {
        case 1:
        	System.out.println("sayý 1 e þittir");
        break;
        case 2:
        	System.out.println("sayý 2 ye eþittir");
        	break;
        case 3:
        	System.out.println("sayý 3 e eþittir");
        	break;
        	default:
        	System.out.println("1-3 arasý bir sayý giriniz!!");
        }
	}

}
