package Assignment10;

public class q28 {

	public static void main(String[] args) {

		
		
		clean("one two three","two");
        clean ("foo bar","foo");
        clean ("he said bla bla bla","bla");

   }

   public static void clean(String str1, String str2) {
       
       System.out.println(str1.replaceAll(str2, "").trim());
       
       
	}

}
