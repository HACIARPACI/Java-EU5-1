package day38_inharitance_part2;

public class FulltimeEmployee extends Employee {

	@Override// same name same parameters override return type must be same
public void calculatePay(int hours, double rate) {
	double total =(hours*rate)*1.05;
	System.out.println(" Fultime employee pay : "+ total );
	
	
}
	
	
	
}
