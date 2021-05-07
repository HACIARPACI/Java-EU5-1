package day28Part5LabCont;

public class Q20 {

	public static void main(String[] args) {

		
		
	int []x= {1,2,3,2,3,2,9,2,2};	
		System.out.println(next2(x)); 
	//	next2(x);
	}
 public static boolean next2(int[]numbers) {
	 boolean flag=false;
	 for (int i = 0; i < numbers.length-1; i++) {
		if(numbers[i]==2&&numbers[i+1]==2) {
			flag=true;
			break;
		}
	}
	if(flag) {
		return true;
	}else {
		return false;
	}
 } 
}
