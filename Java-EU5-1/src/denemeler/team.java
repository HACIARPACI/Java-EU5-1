package denemeler;

public class team {

String name;
String coach;
int coast;
int footballer;
public team(String name, String coach, int coast, int footballer) {

	this.name = name;
	this.coach = coach;
	this.coast = coast;
	this.footballer = footballer;
}
public void getCoach() {
	System.out.println(name+" team has the coach :"+coach);
	
	getOthers();
}

public void getOthers() {
	
	System.out.println(name+"team is :"+coast+" value and has: "+footballer);
	
	
}





}
