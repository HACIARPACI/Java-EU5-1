package day4;

public class discount {

	public static void main(String[] args) {
		//this program calculate the sale price an item that is regulary price $59,
		//with a 20% discount on it
		int regularPrice=59;
		double discount;
		double salesPrice;
		discount= regularPrice*0.2;
		salesPrice= regularPrice-discount; 
		System.out.println("regular price: $"+regularPrice);
		System.out.println("discount amount $"+discount);
		System.out.println("salesprice:$"+salesPrice);
	}

}
