package day36_staticClassMembers;

public class Countable {

	static int instanceCount;// static variable

	public Countable() {
		
	instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
		
		
	}
	
	
}
