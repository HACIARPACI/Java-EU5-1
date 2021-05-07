package day12controlFlow_branching;

public class breakContýnue {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==4) {
	//			break;              // kosul saðlanýnca  loop dýsýns cýkýyor
				continue;           //koul saðlarsa o kosulu atlayýp  looopa devam ediyor
			}
			System.out.println(i);
		}
		
		
		
	}

}
