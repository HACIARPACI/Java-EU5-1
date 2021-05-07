package day_8controlFlowSatatementsIfElse;

public class nestedIf {
//kendin tekrar yazmayý dene
	public static void main(String[] args) {
		boolean isRushHour=true;     //ilk kosuldays ave rush hourdaysa  
		int carType=2;
		double price=0.0;
		if(carType==1) {
			if(isRushHour) {
				price=30;
			}else {
				price=5;
				
			}
		}	else if(carType==2) {
			 	if(isRushHour) {
			 		price=55.30;
			 	}else {
			 		price=15.99;
			 	}
			}
		System.out.println("total cost="+price);
		}
		}
	

