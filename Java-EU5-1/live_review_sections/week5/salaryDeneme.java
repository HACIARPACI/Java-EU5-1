package week5;

public class salaryDeneme {

public double rate;
public int weeklyHour;
public double taxRate;
	
public void getInfo(double hourlyRate,int hour,double tax) {
	rate=hourlyRate;
	weeklyHour= hour;
	taxRate=tax;
	
}
public double salary() {	
return (rate*weeklyHour*52);

}
public double getTax() {
	return salary()*taxRate;
}
public double netSalary() {
	return salary()-getTax();
	
}
public String toString() {
	return "salaryDeneme [rate=" + rate + ", weeklyHour=" 
+ weeklyHour + ", taxRate=" + taxRate +"salary= "+salary()+"tax= "+getTax()+"]";
}

}