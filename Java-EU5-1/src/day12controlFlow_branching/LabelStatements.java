package day12controlFlow_branching;

public class LabelStatements {

	public static void main(String[] args) {

		int i=0;
		outer:
			do {
				i=8;
				inner:
					while(true) {
						System.out.println(i--);
						if(i==4) {
							break outer; //break inner ; yaparsan 8 7 6 5 8 7 6 5 infinite olur
						}
					}
			}while(true);
			
			
		
		
			
		
	}

}
