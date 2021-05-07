package Assignment10;

public class q22 {

	public static void main(String[] args) {

		 String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

	        if (!(html.contains("html"))) {
	            System.out.println("Invalid input!");
	            return;
	        }

	        int firstQuote = html.indexOf('"');
	        int secondQuote = html.indexOf('"', firstQuote + 1);

	        String idAttribute = html.substring(firstQuote + 1, secondQuote);
	        System.out.println(idAttribute);
		
		
	}

}
