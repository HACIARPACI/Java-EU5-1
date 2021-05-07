package day7_controlFlowStatements;

public class IfStatement {

	public static void main(String[] args) {
		int score =60;
		if (score>70) {
		
			System.out.println("You passed with grade A");
		
	}
		int sales,bonus;
		double commissionRate,salary;
		
		sales=5200;
		salary=10000;
		 if(sales>5000) {
		bonus=500;
		commissionRate=1.12;
		salary=salary*commissionRate+bonus;
		 }
		 System.out.println("salary="+salary);
	}

}
