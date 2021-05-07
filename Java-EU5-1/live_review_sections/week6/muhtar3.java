package week6;

public class muhtar3 {

	public static void main(String[] args) {
		 String[] employees = {"John", "Conor McGregor", "Rose", "Breanna", "Shay", "Khabib"};

	        int[] salaries = {100000, 70000, 95000, 110000, 120000, 150000};
		int min =200000;
		int max=0;
		String highest="";
		String lowest="";
				for (int i = 0; i < salaries.length; i++) {
					if(salaries[i]>max) {
						max=salaries[i];
						highest=employees[i];
					}
					if(salaries[i]<min) {
						min=salaries[i];
						lowest=employees[i];
				}
											
					}
				System.out.println("emplyee"+highest+ "has the"+max+"salaries");
				System.out.println("employes"+lowest+"has the lowest salary : "+min);
				}	
				}
		
		
	        
	        
	        
	

	
	




