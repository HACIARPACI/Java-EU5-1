package day31ArrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		
		ArrayList<String>ShoppingList=new ArrayList<>();
		
	ShoppingList.add("paper towel");
	ShoppingList.add("dish soap");
	ShoppingList.add("trash bag");
	ShoppingList.add("clorox");
	ShoppingList.add("gloves");
	ShoppingList.add("shovel");
	//print numbers of items
	int count=ShoppingList.size();
	System.out.println(count);
	// print all in single line
	
	System.out.println(ShoppingList.toString());
	
	//first and last item in single line
	
	System.out.println(ShoppingList.get(0)+" | "+ShoppingList.get(count-1));
	
	ShoppingList.remove("paper towel");
	ShoppingList.remove("shovel");
	
	System.out.println(ShoppingList.toString());
	System.out.println(ShoppingList.get(0));
	
	ShoppingList.remove(0);
	System.out.println(ShoppingList.toString());
	
	for (String item : ShoppingList) {
		
		System.out.println(item);
	}
	
	//remove all item at once
	ShoppingList.clear();
	System.out.println(ShoppingList.toString());

	
	
	
	
	
	
	}

}
