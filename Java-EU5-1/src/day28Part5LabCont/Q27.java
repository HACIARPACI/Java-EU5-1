package day28Part5LabCont;

public class Q27 {

	public static void main(String[] args) {

		int[]x= {1,3,7,8,4,9,7,6};
		System.out.println(adjacent(x));
		
		
		
	}
public static boolean adjacent(int []numbers) {

	boolean flag=false;
for (int i = 0; i < numbers.length-2; i++) {
	if(numbers[i]-numbers[i+1]==-1&&numbers[i+1]-numbers[i+2]==-1) {
		flag= true;
	}	
}
if (flag) {
	return true;
}else {
	return false;
}




}
}
