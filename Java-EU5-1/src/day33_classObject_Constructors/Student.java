package day33_classObject_Constructors;

public class Student {

	String name;
	int age;
	char gender;
	int year;
	String course;
	String university="odtu";
	
	
	
	
	public Student(String name, int age, char gender, int year, String course) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}
	
	public void attendLecture() {
		System.out.println(name + " is atending lecture");
	}
	public void submitAssignment() {
		System.out.println(name+ " is submitting assignment");
	}
	public void attendLab() {
		System.out.println(name+ " is attending labe");
		
		
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", year=" + year + ", course=" + course
				+ ", university=" + university + "]";
	}
	
}
