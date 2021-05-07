package day28Part5LabCont;

public class Q12 {

	public static void main(String[] args) {
		int[]x= {1,2,3};
		int[]y= {
				
				
				
				
				2,3};
		
		System.out.println(have1First(x,y));
	}

	public static int have1First(int []num1,int []num2) {
		
		int output=0;
		if(num1[0]==1) {
			output++;
		}if(num2[0]==1) {
			output++;
		}
		return output;
	}
}
