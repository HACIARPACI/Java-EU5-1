package week4;

public class CatObjects {

	public static void main(String[] args) {

		
	Cat cat1 =new Cat();	
	Cat cat2 =new Cat();	
	
	
	cat1.name="tomas";
	cat1.age=12;
	cat1.breed="mixed";
	cat1.color="brown";
	cat1.size="large";
	cat2.setInfo("mayko", 12, "fold", "black", "medium");
	
	Cat cat3=new Cat();
	cat3.setInfo("týrmýk", 1, "mixed", "yellow", "small");
	
	
	System.out.println(cat1);
	System.out.println(cat2);
	System.out.println(cat3);
	
	cat1.sleep();
	cat2.eats("fish");
	cat3.drinks("milk");
	cat2.sleep();
	
	
	
	
	
	}

}
