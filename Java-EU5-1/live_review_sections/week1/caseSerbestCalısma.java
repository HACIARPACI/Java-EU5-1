package week1;
import java.util.Scanner;

public class caseSerbestCal�sma {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("1-2yada 3 � giriniz: ");
        int say�=scan.nextInt();
        switch(say�) {
        case 1:
        	System.out.println("say� 1 e �ittir");
        break;
        case 2:
        	System.out.println("say� 2 ye e�ittir");
        	break;
        case 3:
        	System.out.println("say� 3 e e�ittir");
        	break;
        	default:
        	System.out.println("1-3 aras� bir say� giriniz!!");
        }
	}

}
