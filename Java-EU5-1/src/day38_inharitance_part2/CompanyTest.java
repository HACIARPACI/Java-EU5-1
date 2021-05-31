package day38_inharitance_part2;

public class CompanyTest {
public static void main(String[] args) {
	

	Employee emp= new Employee();
	FulltimeEmployee ft = new FulltimeEmployee();
	Contructor ct = new Contructor();
	
	emp.calculatePay(40, 40);
	ft.calculatePay(40, 40);
	ct.calculatePay(40, 40);
	
	
	
	
	
   }
}