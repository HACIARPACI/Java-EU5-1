package day23StringManupulatinCont;

public class question15 {

	public static void main(String[] args) {

	//	String str="badsjkkldsk";
		String str="xbadsjkkldsk";
		boolean flag=true;
		for (int i = 0; i < 2; i++) { //ilk iki karakter içinde baþlayacaðý için 0,1 i deneyecek!!
			
			if(str.substring(i, i+3).equals("bad")){
				
			//	System.out.println(true);
				flag=true;
				break;
			}else {
				//System.out.println(false);
				flag=false;
			}
					
				
		}	
			if (flag) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		
		
		
	}

}
