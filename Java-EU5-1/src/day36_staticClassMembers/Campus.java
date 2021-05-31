package day36_staticClassMembers;

public class Campus {
	private String city;
	static String country;
	
	
	static {
		System.out.println("static block-1");
		country="USA";
	}
	public Campus(String city) {
		System.out.println("constructor");
		this.city=city;
	}
	{
		System.out.println("haci");
	}
	
	
	static {
		System.out.println("static block-2");
		country="UK";
	}

}
