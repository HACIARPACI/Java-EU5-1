package Assignment10;

public class q26 {

	public static void main(String[] args) {

	      
	    String str=    uniqueChars("vay vya vyasd");
	    System.out.println(str);
	        
	        

	    }

	    public static String uniqueChars(String string) {
	        String dummy="";
	        
	        for (int i = 0; i < string.length(); i++) {
	            String searched=""+string.charAt(i);
	            if (!dummy.contains(searched) ) {
	                dummy+=searched;
	                
	            }
	            
	        }
	        
	        
	        return dummy;
		
		
		
		
	}

}
