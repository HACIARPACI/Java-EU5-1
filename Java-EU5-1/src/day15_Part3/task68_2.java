package day15_Part3;

public class task68_2 {

	public static void main(String[] args) {
		yearsUntilRetirement("hacý",1990);
		calculateAge(1990);
		
		
	/*	yearsUntilRetirement("mike",1990);
		//calculateAge(1990);
	}
public static int calculateAge(int yearBirth) {
	//int age=2021-yearBirth;
	return 2021-yearBirth;
	//return age;
} 

public static void yearsUntilRetirement(String name, int year) {
	 int retirementAge= 65-calculateAge(year);//retirement age = 65-age
	 
	// int retirementAge= 65-calculateAge(year)
	 
	 System.out.println(name+"retires in "+retirementAge+" years");*/
		
		
}    

	public static int calculateAge(int yearBirth) {
		int age=2021-yearBirth;
		return age;
	}
	 public static void yearsUntilRetirement(String name,int year) {
		 int retirementAge=65-calculateAge(1990);
		 System.out.println(name +"retires in"+retirementAge+"years");
	 }
	
}








