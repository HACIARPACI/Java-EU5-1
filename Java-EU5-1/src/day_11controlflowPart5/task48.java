package day_11controlflowPart5;

public class task48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=6;
		for (int i = 1; i <=rows; i++) {
	// buna bak		//for(int j=6;j>=i;j--) {   //"j "  "i" kadar cals��r 1nci sat�rda 1
			for(int j=1;j<=i;j++) {
				System.out.print("*");//2nci satirda 2 defa cals��r
		}
		System.out.println();
		}		
	}
}
