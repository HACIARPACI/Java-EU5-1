package week5;

public class salaryObjects {
public static void main(String[] args) {
	
salary salary1=new salary();//employee 1
	salary1.setInfo(45, 40, 0.3);
	System.out.println(salary1);
	salary salary2=new  salary();// hourlyRate=55weeklyHour=45
	salary2.setInfo(55, 45, 0.28);
	System.out.println(salary2);// to string method gets executed automatically
	//employe2 hourlyRate=$65
	System.out.println("---------------------------");
	salary2.rate=65;
	System.out.println(salary2);
	
	
	
	
}
}
