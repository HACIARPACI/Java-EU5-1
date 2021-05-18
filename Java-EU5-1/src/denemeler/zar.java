package denemeler;

import java.util.Random;

public class zar {

int sides;
int value;
	
public zar(int numSides) {
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
public int getValues() {
	return value;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
