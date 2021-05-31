package day38_inharitance_part2;

public class StaticTest {

	public static void main(String[] args) {

		StaticSub obj= new StaticSub();
		obj.num=5;
		obj.print();
		
		StaticSuper.num=10;
		obj.print();
		System.out.println(StaticSub.num);
		
	//	StaticSub.m2(); object ile cağırabilirisn
		obj.m2();
		
		StaticSub.m1();// method static oldugu nin class name ile cağırabilirsin
	}

}
