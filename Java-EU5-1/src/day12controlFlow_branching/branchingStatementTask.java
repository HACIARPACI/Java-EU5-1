package day12controlFlow_branching;

public class branchingStatementTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number =0;
		while(number<15) {
			number++;
			if(number<=5) {
				System.out.println("skipped number"+number);
				continue ;  //burda kullanýlýmca number için 1-5 arasýný cýkarmýþ oluyor,
			}
			
			System.out.println("number="+number);
			if (number >=10) {
				System.out.println("breaking at"+number);
				break;
			}
			
			
			
			
			
		}
		
		
		
	}

}
