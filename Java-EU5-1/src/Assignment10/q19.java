package Assignment10;

public class q19 {

	public static void main(String[] args) {
		
		numberOfTimes("javaxjavacjava");
		
		
	}

	public static void numberOfTimes(String name ) {
		
		int count=0;
		for (int i = 0; i < name.length()-3; i++) {
			
			if(name.substring(i, i+4).equals("java")) {
				
				count ++;
			}
		}
		System.out.println(count);

	}
	
	
}
