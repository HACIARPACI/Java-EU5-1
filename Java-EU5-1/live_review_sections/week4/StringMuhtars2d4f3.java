package week4;

public class StringMuhtars2d4f3 {

	public static void main(String[] args) {

		String str="sddffgdfdhhyuýyggs";  
      int count=0;
        String aranan="";
        String arayan="";
        for (int i = 0; i < str.length(); i++) {
            count=0;
            aranan=str.charAt(i)+"";
            
            for (int j = 0; j < str.length(); j++) {
                arayan=""+str.charAt(j);
                
                if (aranan.equals(arayan)) {
                    count++;
                    
                    }
                }
       str=str.replace(aranan, "");
            System.out.print(aranan+""+count);    
        }
            
    
		
		
		
		
		
	}

}
