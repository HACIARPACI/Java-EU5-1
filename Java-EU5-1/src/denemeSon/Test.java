package denemeSon;

public class Test extends Employ {

	public Test(String name, String jobTitle, int salary, int employeeId) {
		super(name, jobTitle, salary, employeeId);
		
		
	}
	public void smokingTesting() {
		System.out.println();
		
		
	}
	public void creatingTicket() {
		
	}
	public String toString() {
		return "Test [name=" + name + ", JobTitle=" + JobTitle + ", salary=" + salary + ", employeeId=" + employeeId
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
