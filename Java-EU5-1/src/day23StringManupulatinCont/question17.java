package day23StringManupulatinCont;

public class question17 {

	public static void main(String[] args) {
	String	str= "hacı ıcah";  // arada bosluk olsa hac ııcah gibi replace" ","" equalsignorecase yapmalısın
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
