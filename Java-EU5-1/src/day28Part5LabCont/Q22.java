package day28Part5LabCont;

public class Q22 {

	public static void main(String[] args) {

		int[]x= {1,4,1,4,1,4};
		System.out.println(greater14(x));
		
	}
public static boolean greater14(int []numbers) {
	
	int count1=0;
	int count2=0;
	for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]==1) {
			count1++;
		}else if(numbers[i]==4) {
			count2++;
		}
	}
 if(count1>count2) {
	 return true;
 }else {
	 return false;
	 
 }
	
	
	
	
	
	
}
}
