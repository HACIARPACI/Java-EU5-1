package day4;
//this program calculates hourly wages plus overtime
public class wages {

	public static void main(String[] args) {
		double regularWage;
		double basePay=25.75; 
		double regularHours=40;
		double overTimeWages;
		double overTimePay=37.5; 
		double overTimehours=15;
		double totalWage;
		regularWage=basePay*regularHours; 
		overTimeWages= overTimePay*overTimehours;
		totalWage= regularWage+overTimeWages; 
		System.out.println("wages for this week"+totalWage);
	}

}
