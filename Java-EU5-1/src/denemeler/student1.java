package denemeler;

public class student1 {

String isim;	
int yaþ;
int boy;
int kilo;
public student1(String isim, int yaþ, int boy, int kilo) {
	this.isim = isim;
	this.yaþ = yaþ;
	this.boy = boy;
	this.kilo = kilo;
}
public void okulbebesi() {
 
if(yaþ<=4) {
	System.out.println(isim+"okula gidemez büyüsün biraz");	
}

	
}
public void kilocuk() {
if(kilo>20) {
	System.out.println(isim +" kilo vermeli ");
}

}	
}
