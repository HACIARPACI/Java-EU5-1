package Assignment10;

public class q29 {

	public static void main(String[] args) {

		 limit("abcd",2);
	        limit("bla bla",3);
	    }

	    public static void limit(String str, int i) {
	        
	        String returns="";
	        for(int j=0;j<i;j++) {
	            returns=returns+str.charAt(j);
	        }
	        System.out.println(returns);
	        
	     
		
		
	}

}
