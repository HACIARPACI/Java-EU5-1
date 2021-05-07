package day28Part5LabCont;

public class Q21 {

	public static void main(String[] args) {

	int[]x= {2,3,4,2,2,6,2};	
		System.out.println(sum28(x));
		
	}
public static boolean sum28(int []numbers) {
	int sum =0;
	boolean flag=false;
	for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]==2) {
		sum+=numbers[i];	
		}
	}if(sum==8) {
	//	flag=true;
		return true;
	}else {
		return false;
	}
	
	
	
}
	
	
}
