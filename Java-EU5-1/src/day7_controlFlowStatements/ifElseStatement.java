package day7_controlFlowStatements;

public class ifElseStatement {

	public static void main(String[] args) {
		int score =60;
		if (score>70) {
		
			System.out.println("You passed with grade A");
		}
		else {
			System.out.println("you failed");
		}
		int sales,bonus;
		double commissionRate,salary;
		
		sales=6000;
		salary=200;
		 if(sales>5000) {
		bonus=500;
		commissionRate=1.12;
		salary=salary*commissionRate+bonus;
		 }
		 else {
			 bonus=100;
			 commissionRate=1.10;
			 salary=salary*commissionRate+bonus;
		 }
		 
		 System.out.println("salary="+salary);
	}

}
