package MyRepeatSheets;

public class deneme7 {

	public static void main(String[] args) {

		calFeetAndInchesToCms(750);
		calFeetAndInchesToCms(9,6);
		
		
		
	}
public static double calFeetAndInchesToCms(double feet,double inches) {
	double cm=feet*12*2.54+inches*2.54;
	
	if(feet>=0&&inches<=12) {
		System.out.println(feet + " feet," + inches + " inches=" + cm+ " centimeters");

		return cm;
	}else {
		return -1;
	}
	
	
}
	
public static double calFeetAndInchesToCms(double inches) {
	
	int feet =(int)inches/12;
	double remainingInches=inches%12;
	if(inches>=0) {
		System.out.println(inches +"inches :"+feet+" feet and"+ remainingInches+" inches");
		return calFeetAndInchesToCms(feet,remainingInches);
	}else {
		return -1;
	}
	
	
}



}
