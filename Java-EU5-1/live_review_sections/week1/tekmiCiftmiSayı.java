package week1;
import java.util.Scanner;
public class tekmiCiftmiSayý {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayý;
		System.out.println("lütfen bir sayý giriniz:");
		sayý=scan.nextInt();
		if (sayý%2==0){
			System.out.println("girdiðiniz sayý çifttir");
		}
		else {
			System.out.println("girdiðiniz sayý tektir87");
		}
	}

}
