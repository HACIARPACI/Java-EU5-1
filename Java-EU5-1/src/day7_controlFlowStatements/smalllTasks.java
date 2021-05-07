package day7_controlFlowStatements;

public class smalllTasks {

	public static void main(String[] args) {
//1-write an if statements that assigns 5 to x whwn y = 20	
		int x,y;
		y=10;x=10;
		if(y==20) {
			x=5;			
		}
		System.out.println("x="+x +"y="+y);
		// 2- write if satatement that multiples payrete by1.5 if hours is grater than 40
		
		int hours=41;
		double payRate=4500;
		if(hours>40) {
			payRate*=1.5;		
		}
		System.out.println("payrate is"+payRate);
		/*3-  write an if statement that set the variable feets to 50 
		if the boolean variable max is true */
		
		boolean max =true;
		int fee=20;
		if(max==true){
		fee=50;
	}
		System.out.println("fee is "+fee);
		/* 4- write an is satatement that assigns 20 to a if variable b is 50or c is gretaaer 
		and equal to 100*/
		  int a=100;
		  int b=50;
		  int c=300;
		  if(b==50||c>=100) {
			  a=20;
		  }
		System.out.println("a= "+a);
		
		/* 5- write an if sattement  that print "ideal temp" is between 70-80
		
		*/
		int temp=75;
		if (70<=temp&& temp<80) {
			System.out.println("ideal temperature");
		}
			System.out.println("not ideal temp");
		
		int age =18; //task24 vote over 18
		if (age>=18) {
			System.out.println("you re eligible to vote");
		}
		//task 25 greatest number
		int num1=45646;
		int num2=84445;
		int num3=1654987465;
		if (num1>num2&&num1>num3) {
				System.out.println("num1 is the grateset");
		}
			if(num2>num3&&num2>num1) {
		System.out.println("num 2 isthe greatest");
			}
			if (num3>num1&&num3>num2) {
				System.out.println("num3 isthe greatest");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
