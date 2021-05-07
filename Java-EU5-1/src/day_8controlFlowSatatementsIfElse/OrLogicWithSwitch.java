package day_8controlFlowSatatementsIfElse;

public class OrLogicWithSwitch {

	public static void main(String[] args) {
	char grade='D';
	//a b c pass d e fail
/*switch(grade) {

case 'A':
	System.out.println("pass");
	break;
case 'B':
	System.out.println("pass");
	break;
case 'C':
	System.out.println("pass");
	break;
case 'D':
	System.out.println("fail");
	break;
case 'E':
	System.out.println("fail");
}*/
		switch(grade) {                      // sonuc ayný ise kýsaltýlablir.
		case 'A':case 'B':case 'C':
			System.out.println("pass");
			break;
		case 'D': case'E':
			System.out.println("fail");
			break;
		}
		
		
// task 39		
		  char color= 'G';
		  switch(color) {
		  case 'R':case 'r':
			  System.out.println("redlight");
		break;
		  case 'O':case'o':
			  System.out.println("orange light");
			  break;
		  case 'G': case 'g':
			  System.out.println("green light");
			  
			 break;
			 default:
				 System.out.println("invalid light");
			  
			  
			  
		  }
		
		
		
		
		
		
		
		
		
	}

}
