package day36_staticClassMembers;

public class AllBlocks {
	
	public AllBlocks(int x) {
		
		System.out.println("One argument costructor");
		
	}
	public AllBlocks() {
		System.out.println("no arg constructor");		
	}
	
	static {
		System.out.println("first static init");		
	}

	{
		System.out.println("first instance init");
	}
	{
		System.out.println("second instance init");
	}
	
	static {
		System.out.println("second static init");
	}
}
// instance init constructordan önce yazar  her contruction dan önce yazar ama static blok 1 defa yazar