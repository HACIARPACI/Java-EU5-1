package day37_inheritence;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person{

	
int studentID;
String termClass;

ArrayList<String>list=new ArrayList<>(Arrays.asList("mat","geo"));

public void code(String lang) {
	
	System.out.println(name+ " is coding "+lang);
	
}
public void attendClass() {
	System.out.println(name +" is attending "+ termClass+ " class");
}

}
