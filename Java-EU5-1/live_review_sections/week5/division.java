package week5;

public class division {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		if(b!=0) {
		int count =0;
		while(a>=b) {
			
			
			a-=b;
			count ++;
		}
		
		System.out.println(count+" with a reminder  of a "+a);
		
		}else {
		System.out.println("invalid");
	}

}
}
