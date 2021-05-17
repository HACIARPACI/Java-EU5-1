package day34_Constructor;

import java.util.Random;

public class Dice {

int sides;	
int value;	
	
public Dice(int numSides) {
	sides=numSides;
	Roll();
}

public void Roll() {
	
	Random rn=new Random();
	value= rn.nextInt(sides)+1;	
	
}
	
	public int getSides() {
		return sides;
			
	}

public int getValue() {
	
	return value;
	
}
}
