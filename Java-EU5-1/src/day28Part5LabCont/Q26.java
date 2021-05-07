package day28Part5LabCont;

public class Q26 {

	public static void main(String[] args) {

		int[]x= {2,1,2,5,6};
		 System.out.println(top3(x));
		
		
		
		
	}
public static boolean top3(int[]numbers) {
	int oddCount=0;
	int evenCount=0;
	for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]%2==0) {
			evenCount++;
		}else if(numbers[i]%2==1) {
			
			oddCount++;		
	}
	}
	if(evenCount==3||oddCount==3) {
		return true;
	}else {
		return false;
	}
}
	
}
