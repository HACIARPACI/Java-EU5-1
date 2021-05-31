package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

	public static void main(String[] args) {
		
	ArrayList<Integer>list =new ArrayList<>();
	
	list.addAll(Arrays.asList(1,5,8,7,9,5,3,4,7,98,4,41,74,8,64,86,54,57,54,54));
	
/*	for (int i = 0; i < list.size(); i++) {
		if(list.get(i)<10) {
			list.remove(i);
			
			
		}
	}*/
	
//	list.removeIf(each->each<3);
	
list.removeAll(Arrays.asList(1,4));	
	
	System.out.println(list);
		
	System.out.println("--------------------------------");	
		
	
	String[]countryNames= {"UnitedStates Of America","United Kingdom","Tuekey","Japan","Korea","Russia"};
	
	ArrayList<String>countries=new ArrayList<>(Arrays.asList(countryNames));
	System.out.println(countries);
	
	countries.removeIf(p->p.length()>10);
	System.out.println(countries);
	
	System.out.println("///////***********//////////********");
	
	String[]jobTitles= {"SDET","SDET","QE","BA","QA","PO","SM","DataBaser"};
	
	ArrayList<String> jobs=new ArrayList<>(Arrays.asList(jobTitles));
//	jobs.retainAll(Arrays.asList("SDET","QA"));
	
	jobs.removeIf(each-> !(each.equals("SDET")||each.equals("QA")));//remove eder
	
	System.out.println(jobs);
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
	}
	
	
	
}
