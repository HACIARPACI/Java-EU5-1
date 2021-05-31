package week9;

public class Employee {

public	String name,jobTitle;
public 	int ID;
public	double salary;
	


	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, String jobTitle) {
		this(name);
		this.jobTitle = jobTitle;
	}

	public Employee(String name, String jobTitle, int iD) {
		this(name,jobTitle);
		
		ID = iD;
	}

	public Employee(String name, String jobTitle, int iD, double salary) {
		this(name,jobTitle,iD);
		this.salary = salary;
	}

	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", ID=" + ID + ", salary=" + salary + "]";
	}

	
	
}
