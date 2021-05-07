package Assignment10;

public class q27 {

	public static void main(String[] args) {

		
		String str1="javamethomeds";
		String str2="me";
		
		if(str1.contains(str2)) {
		str1=	str1.replaceAll(str2,"["+str2+"]");
			System.out.println(str1);
		}
		
}
}