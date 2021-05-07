package MyRepeatSheets;

public class deneme3 {

	public static void main(String[] args) {
		star(6);
		
		
	}

	public static void star(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
}
