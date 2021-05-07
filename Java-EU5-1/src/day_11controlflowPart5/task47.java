package day_11controlflowPart5;

public class task47 {

	public static void main(String[] args) {
/*benim yaptýðým
		for (int i = 1; i <2; i++) {
			System.out.println("******");
			for (int j = 1; j <=6; j++) {
				System.out.println("******");
			}
		}*/
		
		int rows=6;
		int colums=6;
		for (int i = 1; i <=rows; i++) {
			for(int j=1;j<=colums;j++) {
				System.out.print("*");
		}
		System.out.println();  // buraswý önemli 
		//yoksa alt satýra gecmez parante dýsýna yaz mutlaka nereye yazdýðýna dikkat et
		}	
		
		
	}

}
