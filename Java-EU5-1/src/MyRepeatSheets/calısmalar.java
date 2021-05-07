package MyRepeatSheets;

public class calýsmalar {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		for (int i = 1; i <=500; i++) {
			System.out.println(i+" ");
		}*/
		double top=0;
		double ort=1;
		
		for (int i = 10; i >0; i--) {
			top+=i;
			ort=top/i;
			
		}
		System.out.println(ort); 
		int tektop=1;
		for (int i = 1; i <=999; i++) {
			if(i%2==1) {
				tektop+=i;
			}
			
		}
		System.out.println(tektop);
		}
		
		
		
	}


