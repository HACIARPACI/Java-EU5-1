package day6_logicalOperator;

public class task1 {

	public static void main(String[] args) {
	int  applesCount=20;
	int orangesCount=30;
	int pearsCount=30;
	boolean comp = applesCount<orangesCount||orangesCount>=pearsCount;
	//20<30||30>=30---true
System.out.println(comp);
      

		String outsideWeather;
		int degree;
		outsideWeather="Shinny";
		degree=70;
		boolean comp2= (!(outsideWeather=="rainy"||degree==70));//!(f||T)= !T=F :)
		System.out.println(comp2);

		
		int b=2;
		boolean res= ++b ==2||--b==2 &&--b==2; // F||T&&F= FALSE :) öncelik &  daha öncelikli 
		System.out.println(res);
		
		
		
		boolean x= true,z=true;
		int y=20;
		x=(y!=10)||(z=false);// z=false dikkat et assignment yapmýs
		System.out.println(x);//t||f===== true
		
		
		double a1 = 20;
		double b1 =80;
		double conc=(a1+b1)*25;
		 double rmn = (conc)%40;//rmn 20 cýkýyor.
		 
		 System.out.println("remaining total is equal to 20 or less-"+(rmn<=20));
		 
		// true
		
		
		
		
		
		
		
		
		
		


	}

}
