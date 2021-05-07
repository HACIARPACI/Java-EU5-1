package day22;

public class StringISEmpty {

	public static void main(String[] args) {

		String userName="";
		String passWord="";
		
		if(userName.isEmpty()) {
			System.out.println("username fiels is not be empty");
		}else {
			System.out.println("userName is not empty");
		}
		if(userName.isEmpty()||passWord.isEmpty()) {
			System.out.println("username or password can not be empty");
		}else {
			System.out.println("username or password are not empty"); 
			
		}
		
		
	}

}
