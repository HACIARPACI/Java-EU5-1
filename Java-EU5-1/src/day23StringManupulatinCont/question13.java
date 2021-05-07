package day23StringManupulatinCont;

public class question13 {

	public static void main(String[] args) {

	String str="asdjkdQWEWQkjasdh-";
	String newString="";
/*	for (int i = 0; i < str.length(); i++) {
		
	String a=""+str.charAt(i);
	a= a.concat(str.charAt(i)+"");
	System.out.print(a);
	}	*/
	
	
	for (int i = 0; i <str.length(); i++) {
		
	newString=newString+	str.substring(i, i+1).concat(str.substring(i, i+1));
	}								//her elemaný charat yerine substring 0,1 ile yazýyor String için 
									//char concat yapýlamaz
	System.out.println(newString);
	}

}

