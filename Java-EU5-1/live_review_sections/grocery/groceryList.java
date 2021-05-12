package grocery;

import java.util.Scanner;

public class groceryList {
	static grocery list= new grocery();
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
	boolean exit=false;
	int choice=0;
	printOptions();
	while(!exit) {
		System.out.println("enter your choice");
		choice=scan.nextInt();
		scan.nextLine();
		
		
		switch(choice) {
		case 0:
			printOptions();
			break;
		case 1:
			list.printList();
		break;
		case 2:
			addItem();
		break;
		case 3:
			modifyItem();
		break;
		case 4:
			removeItem();
		break;
		case 5:
			searchItem();
			break;
		case 6:
			exit=true;
		}	
	}
	}
public static void printOptions() {


	System.out.println("\nPress");
	System.out.println("\t 0 - To print choice options.");
	System.out.println("\t 1 - To print the list of grocery items.");
	System.out.println("\t 2 - To add an item to the list.");
	System.out.println("\t 3 - To modify an item in the list.");
	System.out.println("\t 4 - To remove an item from the list.");
	System.out.println("\t 5 - To search an item from the list.");
	System.out.println("\t 6 - To quit the application.");
	
}
public static void addItem() {
	System.out.println("plase enter the grocery item");
	list.addItems(scan.nextLine());
	
	
}
public static void modifyItem() {
	System.out.println("enter item number");
	int itemNo=scan.nextInt();
	scan.nextLine();
	System.out.println("enter replacement item");
	String repItem=scan.nextLine();
	list.modifyItems(itemNo-1,repItem);
}
public static void removeItem() {
System.out.println("enter item number");
int number=scan.nextInt();
	scan.nextLine();
list.removeItems(number-1);	
		
}
public static void searchItem() {
	System.out.println("to look for");
	String select=scan.nextLine();
	if(list.searchItems(select)!=null) {
		System.out.println("found"+ select);
	}else {
		System.out.println(select+ 
			"not found");
	}
	
}


}
