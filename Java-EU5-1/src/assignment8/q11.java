package assignment8;

public class q11 {

	public static void main(String[] args) {
System.out.println( c_profits(400,300));
		 
	        

    }

    public static String c_profits(int buyPrice,int sellPrice) {
        
        if(buyPrice<sellPrice) {
        //	System.out.println("profit"); 
        	return "profit";
        	}
        
        else if(buyPrice>sellPrice) {
            return "loss" ;       	}
        else  {
        	return "no loss";
        	}
        
		
		
		
	}

}
