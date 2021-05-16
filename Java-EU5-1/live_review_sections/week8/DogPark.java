package week8;

public class DogPark {

	public static void main(String[] args) {

	Dog dog1=new Dog();
	dog1.name="Lucy";
	dog1.breed="husky";
	dog1.color="White";
	dog1.gender="Male";
	dog1.age=10;
	
	System.out.println(dog1);	
		
	Dog dog2= new Dog("karabaþ","pitbull","Male","White",3);	
	
	
	System.out.println(dog2);
	}

}
