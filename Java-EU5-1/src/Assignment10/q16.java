package Assignment10;

public class q16 {

	public static void main(String[] args) {


	        
	    // wordAppear("javapython");
	  //      wordAppear("cjavac++");
	      wordAppear("c#javaruby");
	        

	    }
	    
	    public static void wordAppear(String str) {
	        
	        if (str.length()<4) {
	            System.out.println("invalid entry");;
	        } else {
	            for (int i=0; i<2; i++) {
	                if (str.substring(i, i+4).equals("java")){
	                System.out.println("true");
	                break;
	                }
	                
	            System.out.println("false");
	            }
	        }
	        
	    }
		
		
	}


