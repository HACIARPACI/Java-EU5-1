package day_19stringManipulationPart1;

public class task77emoji {

	public static void main(String[] args) {
	/*	String emoji=";0";
		//if(emoji.charAt(0)==':') {
			//if(emoji.charAt(1)==')'||emoji.charAt(1)==)
	//	}
		
		if(emoji.length()!=2) {
			System.out.println("invalid emoji");
			return;//stop execution break loops ta yapýlýr
		}
		// if code reaches this point then emoji is 2char
		// get first and second char and assign to variables
		
		char first= emoji.charAt(0); // bu atamalara mutlaka bak tekrar yaz!!!**
		char second=emoji.charAt(1);
		
		if(first==':') {
			if(second==')'){
			System.out.println("smile");
			}else if(second=='(') {
				System.out.println("sad");
			}
			else if(second=='/') {
				System.out.println("upset");
			}else {
				System.out.println("unknown emoji");
			}
			
			
			
		}else if(first==';') {
			
			if(second==')') {
				System.out.println("wink");
			}else if(second=='0') {
				System.out.println("suprised");
			}else {
				System.out.println("unknown emoji");
			}
			
		}*/
		
		
		String emoji = ";O";
		char first= emoji.charAt(0);
		char second= emoji.charAt(1);
		if (emoji.length()!=2){
			System.out.println("invalid emoji");
		}if(first==':') {
			if(second==')') {
				System.out.println("smile");
			}else if(second=='(') {
				System.out.println("upset");
			}else if(second=='/') {
				System.out.println("sad");
			}
		}else {
			if(first==';') {
				if(second==')') {
					System.out.println("wink");
				}else if(second=='O') {
					System.out.println("surprised");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
