package Assignment10;

public class q25 {

	public static void main(String[] args) {
		

        String s1 = "hacı";
        String s2 = "arpacı";
        mergeString(s1, s2);

    }

    public static void mergeString(String s1, String s2) {

        String dummy = "";
        int x = s1.length();
        int y = s2.length();
       int c =0;
        if (x>y) {
            c=y;
        } else {
            c=x;
        }
        for (int i = 0; i < c; i++) {

            dummy += "" + s1.charAt(i) + s2.charAt(i);

            } 
            
        if (x>y) {
            dummy = dummy + s1.substring(y);
        }else {
            dummy = dummy + s2.substring(x);
            
        }
        
        System.out.println(dummy);

		
		
	
}
	
	
}
