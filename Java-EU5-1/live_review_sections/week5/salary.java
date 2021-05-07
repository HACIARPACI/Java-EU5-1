package week5;
/*Salary:
    attributes
        rate, weeklyHour, taxRate
    actions:
        setInfo(), salary(), totalTax(), salaryAfterTax(), toString()*/


	
 
public class salary {

	public double rate;
	public int weeklyHour;
	public double taxRate; 
	
	public void setInfo(double hourlyRate, int numberOfHours,double tax) {
		
		rate= hourlyRate;    //tek tek girmemek için setInfo yaptý
		weeklyHour=numberOfHours;
		taxRate=tax;
	}
	
	public double salary() {   //salary before tax
		return rate*weeklyHour*52; //annula salary	
	}
	public double totalTax() {
		return salary()*taxRate; // total tax
	}
	public double salaryAfter() {
		return salary()-totalTax();
	}

	public String toString() { //allows us to print salary objects
		return "salary [rate=$" + rate + ", weeklyHour=" + weeklyHour 
				+ ", taxRate=" + taxRate +", salary=$"+salary()
				+", total tax=$ "+totalTax()+", salary after tax=$ "
				+salaryAfter()+"]";
	}
	
}

















