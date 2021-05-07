package day28Part5LabCont;


public class Q10 {

	public static void main(String[] args) {

	int[]x= {2,2,2};
	int[]y= {1,2,5,7,5,4,5,3,3,3,4};
		
	
	System.out.println(twice23(y));
	}

	public static boolean twice23(int[]numbers) {
		int total1=0;
		int total2=0;
	for (int value : numbers) {
		if(value==2) {
			total1++;
	}else if(value==3) {
		total2++;
	}
	
}
	if(total1==2||total2==2) {
		return true;
	}else {
		return false;
	}
	
}
}