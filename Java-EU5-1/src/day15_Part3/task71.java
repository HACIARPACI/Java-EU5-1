package day15_Part3;

public class task71 {

	public static void main(String[] args) {
		calFeetAndToCm(100);
		calFeetAndToCm(6,5);
		

	}
	
	public static double calFeetAndToCm(double feet,double inch) {
		if(feet>=0&&(inch>=0&&inch<=12)) {
			double cm= (feet*12*2.54)+inch*2.54;
			System.out.println(feet+" feet "+inch+" inch "+cm+" cm eder ");
			return cm;
			
		}else {
			return -1;
		}
		
		
	}
	
	public static double calFeetAndToCm(double inch) {
		if(inch>=0) {
			double feet=(int)inch/12;
			double kalanInch=inch%12;
			System.out.println(inch+"inch="+feet+" feet "+kalanInch+" inch eder ");
			return calFeetAndToCm(feet,kalanInch);
		}else {
			return -1;
		}
		
	}
}
