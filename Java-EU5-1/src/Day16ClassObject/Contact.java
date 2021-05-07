package Day16ClassObject;

public class Contact {
String name;
String phoneNumber;
String email;


public void call() {
	System.out.println("calling "+ name+ "    ");
	
}
	public void sendMessage() {
		System.out.println("Sending message to "+ phoneNumber + "| name : "+ name);
		
	}
	public void sendEmail() {
		System.out.println(" sending email to" + email+  "    ...");
		
	}
	
}
