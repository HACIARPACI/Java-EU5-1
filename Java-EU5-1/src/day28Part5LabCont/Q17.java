package day28Part5LabCont;

public class Q17 {

	public static void main(String[] args) {
		int[]x= {10,3,1,6};
		System.out.println(difference(x)); 
		
	}
public static int difference(int[]numbers) {
	int max=-6546445;
	int min=+46465464;
	
	for (int j = 0; j < numbers.length; j++) {
	if(numbers[j]>max) {
		max=numbers[j];
	}
	}
	// int min =max dersek çok þýýk olur
	for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]<min) {
			min=numbers[i];
		}
	}
	return (max-min);
	
	
}
}	

