package denemeler;

public class student1 {

String isim;	
int ya�;
int boy;
int kilo;
public student1(String isim, int ya�, int boy, int kilo) {
	this.isim = isim;
	this.ya� = ya�;
	this.boy = boy;
	this.kilo = kilo;
}
public void okulbebesi() {
 
if(ya�<=4) {
	System.out.println(isim+"okula gidemez b�y�s�n biraz");	
}

	
}
public void kilocuk() {
if(kilo>20) {
	System.out.println(isim +" kilo vermeli ");
}

}	
}
