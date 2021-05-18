package day35encapsulation;

public class PersonTest {
public static void main(String[] args) {
	

	Person p= new Person();
	
	p.setAge(-20);
	p.setGender('m');
	p.setName("hacý");
	
	System.out.println(p.getName());
}
}