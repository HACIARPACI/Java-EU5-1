package week2Muhtar;

public class IfStatement {

	public static void main(String[] args) {
		int a=10, b=2, c=30;// assume a b c are different numbers 
		
		boolean aIsMaximum = a>b&& a>c;  
		boolean bIsMaximum = b>a&& b>c;
	//	boolean bIsMaximum = !aIsMaximum&&b>c;
		boolean cIsMaximum = c>b&&c>a ;
	//  boolean cIsMaximum = !aIsMaximum&&!bIsMaximum;
		
		if(aIsMaximum){
			System.out.println(a+"is maximum");
		}else if(bIsMaximum){
			System.out.println(b+"is the maximum");
		}else {
			System.out.println(c+"is the maximum ");
		}
		
		//koþulu boolean a atýyor!!!!!
		
		
		
		
		
		
	}

}
