package day_9ControlFlowTernaryFor;

public class task44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	double kph=60;
		double mph=54.5;
		System.out.println("kph \t\t mph");
		for (kph = 60; kph <=130; kph+=10) {
			mph=kph*0.6214;
			System.out.println(kph+"\t\t"+mph);
		}*/
	//constants	
		final int STARTING_KPH=60;
		final int MAX_KPH=130;
		final int INCEREMENT=10;
		//VARÝABLES
		int kph;
		double mph;
		//header
		System.out.println("kph\t\tmph"); 
		System.out.println("---------------");
		for(kph=STARTING_KPH;kph<=MAX_KPH;kph+=INCEREMENT) {
			mph=kph*0.6214;
			System.out.println(kph+"\t\t"+mph);
		}
		
		int k=60;
		double m=66;
		for (k = 60; k <= 130; k+=10) {
			m=k*0.6214;
			System.out.println(k+"   "+m);
		}
		
		
		
		
		
		
		
		
		
	}

}
