package denemeler;

public class �al��anTest {

	public static void main(String[] args) {

		�al�san[]t�m�= {new �al�san("hac�","qa",1056,15000),
				new �al�san("summa","qe",1055,18000)};
		
		double maxSalary=0;
		double minSalary= Double.MAX_VALUE;
		
		String nameOfMaxSalary="";
		String nameOfMinSalary="";
		for (�al�san ki�i : t�m�) {
			if(ki�i.salary>maxSalary) {
				maxSalary=ki�i.salary;
				nameOfMaxSalary=ki�i.name;
			}
		if(ki�i.salary<minSalary) {
			minSalary=ki�i.salary;
			nameOfMinSalary=ki�i.name;
		}
		}
		
		System.out.println("en y�k sek maas� alan "+ nameOfMaxSalary);
		System.out.println("en d���k maa�� alan"+nameOfMinSalary);
		System.out.println("en yoksek maas:"+ maxSalary);
		System.out.println("en d���k maas :"+minSalary);
		System.out.println("�al��anlar : "+t�m�[0]+t�m�[1]);
		
		
		
		
		
		
	}

}
