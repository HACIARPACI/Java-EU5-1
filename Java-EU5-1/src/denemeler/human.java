package denemeler;

public class human {

	String name;
	char gender;
	int age;
	int height;
	public human(String name, char gender, int age, int height) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
	}
	public String toString() {
		return "human [name=" + name + ", gender=" + gender + ", age=" + age + ", height=" + height + "]";
	}
	
	
}
