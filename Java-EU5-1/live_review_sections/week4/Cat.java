package week4;

public class Cat {

	
	public String name;
	public int age; 
	public String breed;
	public String color;
	public String size;

	
	public void setInfo(String catName,int catAge,String catBreed,String catColor,String catSize) {
		name=catName;
		age=catAge;
		breed=catBreed;
		String Color;
		String Size;
	}
	
	public void eats(String food) {
		System.out.println(name +"eating"+food);			
	}
	public void drinks(String drinks) {
		System.out.println(name +" is drinking "+drinks);
			
	}
	public void sleep() {
		
		System.out.println(name+" is sleeping");
	}
	
	
	
}
