package week1;

public class nestedIFIndirim {

	public static void main(String[] args) {
		
		
		int aracsay�s�=6;
		double ucret=25.0;
		double topucret=aracsay�s�*ucret;
		boolean cumartesi=true;
		boolean kirli= false;
		if(kirli) {
			if(cumartesi&(aracsay�s�>5)) {
				topucret=((aracsay�s�-1)*ucret);
				System.out.println("borcunuz ="+topucret);
			}else {
				System.out.println("borcunuz="+topucret);
			}
		}else {
			System.out.println("arac�n�z kirli de�il");
		}

	}

}
