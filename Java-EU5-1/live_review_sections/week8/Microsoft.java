package week8;

public class Microsoft {	   //Microsoft HAS A employee
public static void main(String[] args) {
	
	Employee [] testers= {new Employee("Kunduz","SDET",123,100000),
							new Employee("Zina","Qe",321,75000),
							new Employee("Murat","QA",789,105000),
							new Employee("Bunyamin","SDET",852,110000)};		
	
	double maxSalary=0 ;
	double MinSalary=Double.MAX_VALUE;
	
	String nameOfMaxSalary="";
	String nameOfMinSalary="";
	
	
	for (Employee each : testers) {
		
		if(each.salary>maxSalary) {
			maxSalary=each.salary;
			nameOfMaxSalary=each.name;
		}
		if(each.salary<MinSalary) {
			MinSalary=each.salary;
			nameOfMinSalary=each.name;
		}
	}
	
	System.out.println("max :"+ maxSalary);
	System.out.println("min:"+MinSalary);
	System.out.println(nameOfMaxSalary+" has max salary");
	System.out.println(nameOfMinSalary+" has the min salary");
	
	
	
	
}
}