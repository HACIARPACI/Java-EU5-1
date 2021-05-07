package week2Muhtar;

public class Task1 {

	public static void main(String[] args) {
	/*	Task1: Arithmetic operators
	    Create a class called SalaryCalculator, write a program that can calculate the tax, and salary after tax based on the hourly rate & tax rate
	                ex:
	                         rate = 55;
	                        taxRate = 0.3;         weeklyHours = 40;

	                    then output will be:
	                            your salary is: 105600 USD
	                            your total tax is: 27456 USD
	                            your income after tax is: 78144 USD

	                Assume that a year has 48 weeks (excluding PTO)*/

		int hourlyRate=50;
		double taxRate=0.3;
		int weeklyHour=40;
		int salary=	(hourlyRate*weeklyHour)*48;
		System.out.println("Your salary is :$"+salary); 
		double totalTax=salary*0.3; 
		System.out.println("your totall tax:$"+totalTax);
		
		double salaryAfterTax = salary-totalTax;
		System.out.println("your salary after tax is :$"+salaryAfterTax);
		double eachMonth=salaryAfterTax/12;
		System.out.println("each month salary:$"+eachMonth);
		
	}

}
