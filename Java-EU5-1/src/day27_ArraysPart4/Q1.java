package day27_ArraysPart4;

public class Q1 {

	public static void main(String[] args) {

		int[]x= {1,2,6};
		int[]y= {6,1,2,3};
		int[]z= {13,6,1,2,3};
		
		System.out.println(if6(x));
		System.out.println(if6(y));
		System.out.println(if6(z));
		
		
	}
public static boolean if6(int[]arr) {
	
	if(arr.length<1) {
		return false;
	}
	
	if(arr[0]==6||arr[arr.length-1]==6) {
		return true;
	}else {
		return false;
	}
	
	
	
}
}
