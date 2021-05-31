package day36_staticClassMembers;

public class ABCTest {

	public static void main(String[] args) {

		ABC.m1();// call method through only static way
		
		ABC o1= new ABC();
		o1.m1();
		
		//whwnever all of your methoss in your class static and you want to call them
		//static way(classname.methodname(), then you simply make your constructor private
		
	}
	public static void print() {
	  // static int a=5;// local variables can not be static 
	}
	
	

}
