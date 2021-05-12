package grocery;

import java.util.ArrayList;

public class grocery {
 ArrayList<String>List=new  ArrayList<>();
 public void addItems(String item) {
		List.add(item);
	}
 
 public void printList() {
	System.out.println("you have"+List.size()+"items in your grocery list");
	for (int i = 0; i < List.size(); i++) {
		System.out.println((i+1)+"."+List.get(i));
		
	}
 }
	public void modifyItems(int position,String newItem) {
		List.set(position, newItem);
		System.out.println("grocery item"+(position+1)+" has been modified");
		
	
	
}
	public void removeItems(int number) {
		List.remove(number);
		
	}
public String searchItems(String word) {
	int position= List.indexOf(word);
	if(position>=0) {
		return List.get(position);
	}
	return null;
}
		
	
	
	
}

	


 
 
	
	
	
	

