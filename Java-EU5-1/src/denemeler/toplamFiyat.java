package denemeler;

public class toplamFiyat {
	
	Arazi arazi1;
	fiyat fiyat1;
	public toplamFiyat(Arazi arazi1, fiyat fiyat1) {
		
		this.arazi1 = arazi1;
		this.fiyat1 = fiyat1;
	}
	
	public double topFiyat() {
		return arazi1.araziAlanı()*fiyat1.araziFiyatı();
	}
	

}
