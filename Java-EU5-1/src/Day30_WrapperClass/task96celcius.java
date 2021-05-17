package Day30_WrapperClass;

import java.util.Arrays;

public class task96celcius {

	public static void main(String[] args) {
// substring ile yapma 72 derece  100 derece olunca ortalýk karýsýr.
	String str1 ="Today weather is sunny and 100 degree."
			+ "It is aperfect day topractice java.";

	
/*	String[] arr= str1.split("and ");	
		arr=arr[1].split(" degree");
		System.out.println(arr[0]);
		String degree= arr[0];
		double degreeF= Double.parseDouble(degree);
		
		double degreeC=(degreeF-32)*5/9;
		
	System.out.println(degreeF+"degree is equal to "+Math.round(degreeC)+ " celcius ");*/
	String[]list=str1.split("and ");
	list=list[1].split(" degree");
	System.out.println(list[0]);
	
	String degree=list[0];
	double degreeF=Double.parseDouble(degree);
	double degreeC= (degreeF-32)*5/9;
	
	System.out.println(degreeF+" : "+degreeC);	
	
	
	}

}
