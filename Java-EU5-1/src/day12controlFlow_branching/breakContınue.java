package day12controlFlow_branching;

public class breakCont�nue {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==4) {
	//			break;              // kosul sa�lan�nca  loop d�s�ns c�k�yor
				continue;           //koul sa�larsa o kosulu atlay�p  looopa devam ediyor
			}
			System.out.println(i);
		}
		
		
		
	}

}
