package day24_arrays_part1;

public class task90 {

	public static void main(String[] args) {

		String[]cars= {"bmw","reno","bugatti","merco","honda"};
		boolean flag = false;
		 for (int i = 0; i < cars.length; i++) {
			if(cars[i].equals("honda")) {
				flag=true;
				break;
			}
				
			}
		if(flag) {
			System.out.println("found it");
		}else {
			System.out.println("not found it");
		}
		
		
		
		
		
	}

}
