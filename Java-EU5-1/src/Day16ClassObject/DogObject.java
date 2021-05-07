package Day16ClassObject;

public class DogObject {

	public static void main(String[] args) { // önce object sonra class dog a gider compiler
 	
	Dog dog1= new Dog();
	
	Dog dog2= new Dog();
	
	Dog dog3= new Dog();	
		
 dog1.age=10;
 dog1.color="red";
 dog1.breed="maltese";
 dog1.name="rover";
 dog2.name="kucukucu";
 dog2.age=42;
 System.out.println(dog1.age);
 System.out.println(dog1.color);		
 System.out.println(dog1.breed);		
 System.out.println(dog2.name+" is " +dog2.age);
 dog1.barking();
 dog1.hungry();
 dog1.sleeping();
 dog2.hungry();
 dog2.barking();
 
 
 
	}

	
}
