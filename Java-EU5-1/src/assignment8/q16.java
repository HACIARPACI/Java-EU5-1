package assignment8;

public class q16 {

	public static void main(String[] args) {


        
        System.out.println(booking(true,6,2,2019));
    }

    
    public static  boolean booking(boolean condition,int month,int day, int year) {
        
        
        if(condition!=true||year!=2018||(month==7&&(day<9||day>1))) {
        	return false;
        	}
        
        else {
        	return true;
        	}
		
		
		
	}

}
