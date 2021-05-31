package denemeSon;

import java.util.Arrays;

public class Nokia {

	public static void main(String[] args) {

	Test test1=new Test("hacı","saler",15000,123);	
	Test test2=new Test("summa","end",12000,120);	

	Develo devo1= new Develo("merve","end",13000,155);	
	Develo devo2= new Develo("mer","end",13000,155);	
	Develo devo3= new Develo("mervekaya","end",13000,155);	

	Scrum team1 = new Scrum("ali","veli","deli");
	
	Develo[]develos= {devo2,devo3};
	
	team1.addTester(test1);
	team1.addTester(test2);
	
	team1.addDevelo(devo1);
	team1.addDevelo(develos);
	System.out.println(team1);
	 team1.removeDev(155);
	
	
	
	
	
	}

}
