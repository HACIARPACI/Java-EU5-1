package denemeler;

public class çalýþanTest {

	public static void main(String[] args) {

		çalýsan[]tümü= {new çalýsan("hacý","qa",1056,15000),
				new çalýsan("summa","qe",1055,18000)};
		
		double maxSalary=0;
		double minSalary= Double.MAX_VALUE;
		
		String nameOfMaxSalary="";
		String nameOfMinSalary="";
		for (çalýsan kiþi : tümü) {
			if(kiþi.salary>maxSalary) {
				maxSalary=kiþi.salary;
				nameOfMaxSalary=kiþi.name;
			}
		if(kiþi.salary<minSalary) {
			minSalary=kiþi.salary;
			nameOfMinSalary=kiþi.name;
		}
		}
		
		System.out.println("en yük sek maasý alan "+ nameOfMaxSalary);
		System.out.println("en düþük maaþý alan"+nameOfMinSalary);
		System.out.println("en yoksek maas:"+ maxSalary);
		System.out.println("en düþük maas :"+minSalary);
		System.out.println("çalýþanlar : "+tümü[0]+tümü[1]);
		
		
		
		
		
		
	}

}
