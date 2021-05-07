package day28Part5LabCont;

public class Q8 {

	public static void main(String[] args) {

		int []x= {4,5,0,7,7,6,65,2};
		System.out.println(con23(x));
		
		
	}
	public static boolean con23(int []numbers) {
	for (int value : numbers) {
		if(value==2||value==3) {
			return true;
		}
	}	
		return false;
	/*for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]==2||numbers[i]==3) {
			
			return true;
		}*/
	
	
	
	
	
	

	}
}