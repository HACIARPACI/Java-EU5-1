package denemeSon;

public class Employ {
public String name ,JobTitle;
public  int salary,employeeId;
public Employ(String name, String jobTitle, int salary, int employeeId) {
	this.name = name;
	this.JobTitle = jobTitle;
	this.salary = salary;
	this.employeeId = employeeId;
}
	
public void eat() {
	System.out.println(name+" is eating");
}
public void sleep() {
	System.out.println(name+" is sleeping");
}

public String toString() {
	return "Employ [name=" + name + ", JobTitle=" + JobTitle + ", salary=" + salary + ", employeeId=" + employeeId
			+ "]";
}
	
}
