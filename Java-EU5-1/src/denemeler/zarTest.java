package denemeler;

public class zarTest {

	public static void main(String[] args) {

		zar z1=new zar(6);
	//	z1.Roll();
	rollDice(z1);	
	}		
	public static void rollDice(zar alfa) {
		
		System.out.println("our dice has "+ alfa.getSides()+"sides");
		System.out.println("zar attým "+ alfa.getValues()+ " geldi");
		
		
		
		
	}		
	}


