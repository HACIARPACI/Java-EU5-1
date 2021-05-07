package day_11controlflowPart5;

public class nestedForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			System.out.println("out loop at state"+i);
			for(int p=0;p<=3;p++) {		
				System.out.println("inner loop state "+p);
				if(p==3) {
					System.out.println();
				}
		}
		
		}	
		
		
		
	}

}
