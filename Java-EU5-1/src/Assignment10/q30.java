package Assignment10;

public class q30 {

	public static void main(String[] args) {

		   
        String inputWord = "longword";
        String insertWord = "foo";

        System.out.println(placeString(inputWord, insertWord));
    }

    public static String placeString (String strInput, String strInsert) {
        String dummy ="";
        for (int i =0; i<strInput.length(); i++) {
            
            dummy = dummy + strInput.charAt(i);
                if (i==2) {
                    dummy = dummy +strInsert;
                }
        } return dummy;
		
		
		
		
	}

}
