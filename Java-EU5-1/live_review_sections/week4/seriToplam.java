package week4;

public class seriToplam {

	public static void main(String[] args) {
// 1/1!+1/2!+1/3!............ =?
	int n=5;
	double y=sumSequence(n);	
		System.out.println(y);
	
		
	}

	public static double sumSequence(int n) {
	double sum=0;	
	for (int i = 1; i <=n; i++) {
		
	sum+=1.0/asses4.factoriel(i);
		
		
	}	
	return sum;
		
		
	}

	
	
	
	
}
