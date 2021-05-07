package Week3;

public class branchex {

	public static void main(String[] args) {

	for (int i = 1; i <=18; i++) {
		if(i%2!=0) {
			continue;
		}
		if(i>12) {
		//	break;    //break exits the loop 
			return;    // retun exits the method
		}
		System.out.print(i+" ");
	}	
		
	}

	
	
}
