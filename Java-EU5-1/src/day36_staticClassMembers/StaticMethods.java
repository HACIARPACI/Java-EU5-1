package day36_staticClassMembers;

public class StaticMethods {

	static String name ="Apple";
	int age=10;
	
	public static void show1() {
		show2();// you can not call  instance method from static method
		show4();//call static method from static method
		System.out.println(name);
		System.out.println(age); // static ten static değer çağrılır
	}
	
	public void show2() {
		show1();// static from instance method available
		System.out.println(name);
		System.out.println(age);
	}
	
	public void show3() {
	show2();
	show1();	
	}
	
	public static void show4() {
	show1();
	show3();
		
}
	
	
}
