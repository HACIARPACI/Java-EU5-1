package week1;
import java.util.Scanner;
public class tekmiCiftmiSay� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int say�;
		System.out.println("l�tfen bir say� giriniz:");
		say�=scan.nextInt();
		if (say�%2==0){
			System.out.println("girdi�iniz say� �ifttir");
		}
		else {
			System.out.println("girdi�iniz say� tektir87");
		}
	}

}
