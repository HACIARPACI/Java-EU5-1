package day34_Constructor;

public class DiceTest {

	public static void main(String[] args) {
		final int SIX_SIDES=6;
		Dice sixDice=new Dice(SIX_SIDES);
		
		
		rollDice(sixDice);
		
	}

	public static void rollDice(Dice d) {
		//rolling a 6 sided dice
		System.out.println("rolling a "+ d.getSides()+"sided dice");
		
		//the dice's value : 5
		System.out.println("he dice's value : "+d.getValue());
	}
	
}
