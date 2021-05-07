package day13MethodsPart1;

public class DeepAndDeeper {

	public static void main(String[] args) {
		System.out.println("im starting in main");
		deep();
		System.out.println("now im back in main");
		
	}
	public static void deep() {					//method un içinde baþka method tanýmlýyor
		System.out.println("i am now in deep");
		deeper();
		System.out.println("now im back in deep");
	}
	public static void deeper() {
		System.out.println("im now in deeper");
	}
}
