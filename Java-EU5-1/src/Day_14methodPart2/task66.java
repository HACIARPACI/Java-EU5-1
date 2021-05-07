package Day_14methodPart2;

public class task66 {

	public static void main(String[] args) {
	
		double distanceTravel=distance(90,15);
		
		System.out.println(distanceTravel);
		if(distanceTravel>500) {
			System.out.println("you spent too much gas");
		}else {
			System.out.println("you spent ok gaz");
		}
	}
	

	public static double distance(double speed,int time) {
		
		double distanceTravel=speed*time;
		  return distanceTravel;
	}
	

	}

