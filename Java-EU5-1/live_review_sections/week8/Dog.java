package week8;

public class Dog {

		
		
		public String name,breed,gender, color;
		public int age;
		
		public Dog() {
			
		}
		public Dog(String dogName , String dogBreed , String dogGender ,String dogColor, int dogAge) {
			name=dogName;
			breed=dogBreed;
			gender=dogGender;
			color=dogColor;
			age=dogAge;
			
		}
		
		
		
		public void bark() {  // instance method
		System.out.println(name+ " is barking");
		
}
		public String toString() {
			return "Dog [name=" + name + ", breed=" + breed + ", gendr=" + gender + ", color=" + color + ", age=" + age
					+ "]";
		}
	
	
}
