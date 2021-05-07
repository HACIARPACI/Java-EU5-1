package week1;

public class nestedIFIndirim {

	public static void main(String[] args) {
		
		
		int aracsayýsý=6;
		double ucret=25.0;
		double topucret=aracsayýsý*ucret;
		boolean cumartesi=true;
		boolean kirli= false;
		if(kirli) {
			if(cumartesi&(aracsayýsý>5)) {
				topucret=((aracsayýsý-1)*ucret);
				System.out.println("borcunuz ="+topucret);
			}else {
				System.out.println("borcunuz="+topucret);
			}
		}else {
			System.out.println("aracýnýz kirli deðil");
		}

	}

}
