package day_9ControlFlowTernaryFor;

public class forLoop {

	public static void main(String[] args) {
		//print 15 times hello
	//	System.out.println("hello");

		for(int i=0;i<5;i++){
			System.out.print("hello");
		}
		
		for (int i = 1; i < 11; i++) {
			System.out.println("i="+i);
		}
			
		for (int i = 5; i <=10; i++) {
			System.out.println("i ="+i);
		}
		for(int num=20; num>=10; num--) {
			System.out.println("num="+num);
		}
		for(int i=0;i<=100;i+=10) {
			System.out.println("i="+i);		
		}
		for(int i=50;i>=0;i-=5) {
			System.out.println("i="+i);
		}
		
	}

}
