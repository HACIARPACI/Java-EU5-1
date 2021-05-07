package day13MethodsPart1;

public class StudentMethod {

	public static void main(String[] args) {
		sayHello();  //sýra deðiþtitireblilr.
		code();
		study();
	}

	public static void sayHello() 	{
		System.out.println("inside sayHello method ");
	}
	
	public static void code() {
		System.out.println("student is studying");
	}
	
	public static void study() {
		System.out.println("student is studying java");
	}
}
