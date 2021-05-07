package day4;

public class castOparator {

	public static void main(String[] args) {
	//int x='A'; system.out.println(x): 65 cýkar neden char deðil-
	
// double d=20; yazdýrýnca 20.0 cýkar
		System.out.println(-(104)%5);
		int x=130;
		byte b= (byte)x; //parantez içine alýrsak sýkýntý yok convert oluyor
		System.out.println(b);//-126 deðer veri kaybý oluor
		int a=220;
		double c=(double)a;// büyük datadan küçük data istendiðinde kayýp olmaz
		System.out.println(a);
		//implicit explicit casting 
		int pies=10,people=4;
		double piesPerson;
		piesPerson=(double)pies/people;
		System.out.println(piesPerson);
		int ali=10,veli=4;
		double celil;
		celil=ali/(double)veli;
		System.out.println(celil);//kullanýmý böylede olablir
		int hacý=45,naci=88;
		double vedat;
		vedat= hacý*naci;
		
		System.out.println(vedat);
		

	}

}
