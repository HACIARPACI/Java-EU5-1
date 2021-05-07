package lab2;

import java.util.Scanner;

public class soru6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the amount of purcahse");
		double amount=scan.nextDouble();
		double countryTax=4;
		double stateTax=2;
		totalSalesTax(amount,stateTax,countryTax);
		
		
		
		
	}
	
	
	public static void totalSalesTax(double amount, double stateTax,double countryTax) {
		double stateSalesTax=amount*stateTax/100;
	    double countrySalesTax=amount*countryTax/100;
	    double totalSalesTax=stateSalesTax+countrySalesTax;
	    double totalSales=amount+stateSalesTax+countrySalesTax;
	    
	    System.out.println("amount of the purchase: "+ amount+ ", the state sales tax : "+ stateSalesTax + ", county sales tax: " + countrySalesTax + 
                ", the total sales tax :"+ totalSalesTax + ", total of the sale :" + totalSales); 
	}
	
	
}
