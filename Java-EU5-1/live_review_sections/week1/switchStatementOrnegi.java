package week1;
import java.util.Scanner;
public class switchStatementOrnegi {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("l�tfeni�lem yapmak istedi�iniz i�lem numaras�j� se�iniz \n 1-toplama\n2-c�karma\n 3-b�lme");
		
		//int islem=2;
		int islem= scan.nextInt(); 
		switch(islem) {
		case 1:
			System.out.println("toplama i�lemi");
			break;
		case 2:
			System.out.println("��karma i�lemi");
			break;
		case 3: 
			System.out.println("b�lme i�lemi i�lemi");
			break;
			default:
				System.out.println("i�lem numaras�n� do�ru se�iniz");
		}
		}

	}


