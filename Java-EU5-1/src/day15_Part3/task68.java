package day15_Part3;

public class task68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int age=calculateAge(1956);	
		yearsUntilRetirement("hacý",37);
		System.out.println(age);
		
	}
public static int calculateAge(int yearBirth) {
	int age=2021-yearBirth;
	return age;
}

public static void yearsUntilRetirement(String name,int year) {
	System.out.println(name+"retires in"+year+" years" );
	
}
}
