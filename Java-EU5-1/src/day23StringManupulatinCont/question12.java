package day23StringManupulatinCont;

public class question12 {

	public static void main(String[] args) {

		String str="catjsdjkdogcatdsfdsdoogdog";
		int count1=0;
		int count2=0;
//		boolean result;
		for (int i = 0; i < str.length()-2; i++) {
			if(str.substring(i, i+3).equals("cat")) {
				count1++;
			}
			if(str.substring(i,i+3).equals("dog")) {
				count2++;
			}
		
			}
	
	if(count1==count2) {     		// int olduðu için equall olmaz!!!!!
		System.out.println(true);
	}else {
		System.out.println(false);
		
	}
	}

}
