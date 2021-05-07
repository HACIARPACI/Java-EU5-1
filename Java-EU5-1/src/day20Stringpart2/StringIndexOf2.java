package day20Stringpart2;

public class StringIndexOf2 {

	public static void main(String[] args) {
		String list ="html-selenium-angular-jenkins-grid";
		int firstDash= list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash= list.indexOf("-", 5);
		System.out.println(secondDash);
		
		int third= list.indexOf("-", secondDash+1);
		System.out.println(third);
		
		int lastDash=list.lastIndexOf("d");
		System.out.println(lastDash);
		if(list.length()-1==lastDash) {
			System.out.println(true);
		}
		
		
		
		
	}

}
