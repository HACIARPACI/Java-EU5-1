package day_8controlFlowSatatementsIfElse;

public class Task_37switcedStatements {

	public static void main(String[] args) {
		String model="apple";
		/*String apple, dell,acer ;
		apple="apple";
		dell="dell";
		acer="acer"; */
		switch(model) {
		case "apple":
			System.out.println("apple no virus");
			break;
		case "dell":
			System.out.println("tough one");
			break;
		case "acer":
			System.out.println("dont buy");
			break;
		default:
			System.out.println("do not but that one"); 
	}
	}
}
