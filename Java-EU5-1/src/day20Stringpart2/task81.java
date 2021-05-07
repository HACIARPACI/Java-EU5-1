package day20Stringpart2;

public class task81 {

	public static void main(String[] args) {
	
	
/*	String time = "10/01/2019 15:42:00";
	System.out.println(timeStamp(time));
		
	}

	public static String timeStamp(String time) {
		
		
		time=time.replace("/","").replace(":", "").replace(" ", "");
		return time;*/
		
		
		
		String a =timeStamp("23/12/1985 19:56:41");
		System.out.println(a);
		
		
		
		
		
	}
	
	
	public static String timeStamp(String date) {
		
	date= 	date.replace("/" ,"").replace(":", "").replace(" ", "");
		return date;
	}
	
	
}
        