package day4;

public class castOparator {

	public static void main(String[] args) {
	//int x='A'; system.out.println(x): 65 c�kar neden char de�il-
	
// double d=20; yazd�r�nca 20.0 c�kar
		System.out.println(-(104)%5);
		int x=130;
		byte b= (byte)x; //parantez i�ine al�rsak s�k�nt� yok convert oluyor
		System.out.println(b);//-126 de�er veri kayb� oluor
		int a=220;
		double c=(double)a;// b�y�k datadan k���k data istendi�inde kay�p olmaz
		System.out.println(a);
		//implicit explicit casting 
		int pies=10,people=4;
		double piesPerson;
		piesPerson=(double)pies/people;
		System.out.println(piesPerson);
		int ali=10,veli=4;
		double celil;
		celil=ali/(double)veli;
		System.out.println(celil);//kullan�m� b�ylede olablir
		int hac�=45,naci=88;
		double vedat;
		vedat= hac�*naci;
		
		System.out.println(vedat);
		

	}

}
