package day_8controlFlowSatatementsIfElse;

public class switchedStatements {

	public static void main(String[] args) {
String weather="windy";///sadece match yapar true false yapmaz 
 switch(weather) {

case "sunny":                                                //break silinirse alttaki kodu da yazar
	System.out.println("go to park");
	System.out.println("ceode java");
	break;
case "hot":
	System.out.println("go to swimming");
	System.out.println("ceode java");
	break;
case "windy":
	System.out.println("go to park");
	System.out.println("ceode java");
	break;
case "snow":
	System.out.println("go snowBoarding");
	System.out.println("ceode java");
	break;
	default:
		System.out.println("code java in any weather");
	
}
	}

}
