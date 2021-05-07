package week1;

public class switchStatementsCalculator {

	public static void main(String[] args) {
		char islem ='*';
		double n1=12.2; double n2=45.56;
		double sonuc=0;
		switch(islem) {
		case '+' : 
			sonuc= n1+n2;
			break;
		case '-' :
			sonuc= n1-n2;
			break;
		case '*':
			sonuc= n1*n2;
			break;
		case '/':
			sonuc= n1/n2;
			break;
			default:
				System.out.println("yanlýþ iþlem tekrar deneyiniz ");
			
		}
			System.out.println("sonuc="+sonuc);
	}

}
