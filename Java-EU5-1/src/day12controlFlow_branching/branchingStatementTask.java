package day12controlFlow_branching;

public class branchingStatementTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number =0;
		while(number<15) {
			number++;
			if(number<=5) {
				System.out.println("skipped number"+number);
				continue ;  //burda kullan�l�mca number i�in 1-5 aras�n� c�karm�� oluyor,
			}
			
			System.out.println("number="+number);
			if (number >=10) {
				System.out.println("breaking at"+number);
				break;
			}
			
			
			
			
			
		}
		
		
		
	}

}
