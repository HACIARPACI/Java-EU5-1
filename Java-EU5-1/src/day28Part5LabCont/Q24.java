package day28Part5LabCont;

public class Q24 {

	public static void main(String[] args) {

	int []x= {1,2,2,1};	
		int a=1;
		
	System.out.println(pair(x,a));	
		
	}
public static boolean pair(int[]numbers,int number) {
//	boolean flag=false;
	for (int i = 0; i < numbers.length-2; i++) {
		if(numbers[i]==number&&(numbers[i+1]==number	||numbers[i+2]==number)) {
			return true;
		}
}
	return false;
}
}