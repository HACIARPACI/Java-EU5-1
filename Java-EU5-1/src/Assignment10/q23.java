package Assignment10;

public class q23 {

	public static void main(String[] args) {

		  
        String str="xxbreadjambreadyy";
        
        int i=str.indexOf("bread");//2
        int j=str.indexOf("bread", i+1);//10
       // int k=j-i;
        
       // if(k==5){
       // System.out.println("nothing");
        if(str.replaceFirst("bread", "").contains("bread")) {
        System.out.println(str.substring(i+5, j));
        }else  {
            System.out.println("nothing");
        }
    }
		
		
	}


