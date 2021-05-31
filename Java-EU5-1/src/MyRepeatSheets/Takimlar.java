package MyRepeatSheets;

public class Takimlar {

String country;
String name;
double value;
int hasCup;



public void basari() {
	System.out.println(name+" takımı has :" +hasCup+ " cups"); 
}

public void ulke() {
	
	System.out.println(name +" takımı "+ country+" ülkesinden ");
	
}

public void oyuncuSayısı(int numbers) {
	
	System.out.println(name +" takımının "+ numbers+" oyuncusu var ");
	
}
	
}
