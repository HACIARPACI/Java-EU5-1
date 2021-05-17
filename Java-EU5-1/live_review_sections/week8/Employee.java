package week8;

public class Employee {

	public String name,jobTitle;
	public int ID;
	public double salary;
	
	
	
	public Employee(String name, String jobTitle, int iD, double salary) { //allow s us toinitialize all instance of Employee object
		
		this.name = name;
		this.jobTitle = jobTitle;
		ID = iD;
		this.salary = salary;
	}



	public String toString() { //allow s us to print Employee object
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", ID=" + ID + ", salary=" + salary + "]";
	}

	
	// Employee tester1= new Employee("Kunduz","SDET",123,100000);
	//Employee tester2= new Employee("Kunduz","SDET",123,100000);
    //Employee tester3= new Employee("Kunduz","SDET",123,100000);
    //Employee tester4= new Employee("Kunduz","SDET",123,100000);
	
}
