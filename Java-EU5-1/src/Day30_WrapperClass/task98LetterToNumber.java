package Day30_WrapperClass;


public class task98LetterToNumber {

	public static void main(String[] args) {
		
	     String str=" 345634o6234ne09*09890t908w908o0fiv9e8t00h00r000e000e000";
	        
	        decodeTheCode(str);
	     
	        
	    }

	    public static void decodeTheCode(String str) {
	        
	        String strNumber="";
	        
	       for (int j = 0; j < str.length(); j++) {
			       
	      //    if ((str.charAt(j)>=65&&str.charAt(j)<=90)||(str.charAt(j)>=97&&str.charAt(j)<=122)) {
	             if(Character.isAlphabetic(str.charAt(j))) { 
	                strNumber+=str.charAt(j);
	                
	                if (strNumber.equalsIgnoreCase("one")) {
	                    System.out.println(1);
	                    strNumber=strNumber.replaceFirst("one", "");
	                }
	                if (strNumber.equalsIgnoreCase("two")) {
	                    System.out.println(2);
	                    strNumber=strNumber.replaceFirst("two", "");
	                }
	                if (strNumber.equalsIgnoreCase("three")) {
	                    System.out.println(3);
	                    strNumber=strNumber.replaceFirst("three", "");
	                }
	                if (strNumber.equalsIgnoreCase("four")) {
	                    System.out.println(4);
	                    strNumber=strNumber.replaceFirst("four", "");
	                }
	                if (strNumber.equalsIgnoreCase("five")) {
	                    System.out.println(5);
	                    strNumber=strNumber.replaceFirst("five", "");
	                }
	                if (strNumber.equalsIgnoreCase("six")) {
	                    System.out.println(6);
	                    strNumber=strNumber.replaceFirst("six", "");
	                }
	                if (strNumber.equalsIgnoreCase("seven")) {
	                    System.out.println(7);
	                    strNumber=strNumber.replaceFirst("seven", "");
	                }
	                if (strNumber.equalsIgnoreCase("eight")) {
	                    System.out.println(8);
	                    strNumber=strNumber.replaceFirst("eight", "");
	                }
	                if (strNumber.equalsIgnoreCase("nine")) {
	                    System.out.println(9);
	                    strNumber=strNumber.replaceFirst("nine", "");
	                }
	                if (strNumber.equalsIgnoreCase("zero")) {
	                    System.out.println(0);
	                    strNumber=strNumber.replaceFirst("zero", "");
	                }
	                                                
	            }
	      
	        }
	             
	
	 }	
}	

