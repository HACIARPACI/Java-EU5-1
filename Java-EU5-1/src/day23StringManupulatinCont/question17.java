package day23StringManupulatinCont;

public class question17 {

	public static void main(String[] args) {
	String	str= "hac� �cah";  // arada bosluk olsa hac ��cah gibi replace" ","" equalsignorecase yapmal�s�n
		String reverse="";
		for (int i = str.length()-1 ; i>=0; i--) {
			
			reverse=reverse+str.charAt(i);            // reverse=""+str.charAt(i);   false oluyor dikkat et 
		}
		
		if (str.equals(reverse)){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
