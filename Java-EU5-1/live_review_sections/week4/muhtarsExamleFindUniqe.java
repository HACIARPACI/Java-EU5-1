package week4;

public class muhtarsExamleFindUniqe {

	public static void main(String[] args) {

	

	
		
		
	

	
		String str = "aabbccdkjffg";
		String aranan="";
		String arayan="";
		String tek="";
		for (int i = 0; i < str.length(); i++) {
			int count=0;
			  aranan=""+str.charAt(i);
		
			for (int j = 0; j < str.length(); j++) {
				  arayan=""+str.charAt(j);
				if(arayan.equals(aranan)) {
					count ++;
					if(count<2) {
						tek+= aranan;
						System.out.println(tek);

					}
				}
			}
		}
	}
}	

	
	

	

		
		
		
		
		
		
		
		