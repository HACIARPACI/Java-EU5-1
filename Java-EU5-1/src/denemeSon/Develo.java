package denemeSon;

public class Develo extends Employ {

	public Develo(String name, String jobTitle, int salary, int employeeId) {
		super(name, jobTitle, salary, employeeId);
		
		
	}

	public void coding() {
		System.out.println(name +" is coding");
	}

	public String toString() {
		return "Develo [name=" + name + ", JobTitle=" + JobTitle + ", salary=" + salary + ", employeeId=" + employeeId
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
}
