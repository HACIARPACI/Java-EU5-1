package week5;

public class pizzaOrder {

	public static void main(String[] args) {

/* 1st pizza large cheese 2 pepper3
	2nd small chesse 2 pepper 1	
	3rd medium cheese 3 pepper2				*/													
	Pizza pizza1=new Pizza();	
	Pizza pizza2=new Pizza();	
	Pizza pizza3=new Pizza();	
	Pizza hüseyine =new Pizza();
	
	hüseyine.customOrder("large", 5, 3);
		pizza1.customOrder("large", 2, 3);
		pizza2.customOrder("small", 2, 1);
		pizza3.customOrder("medium", 3, 2);

		System.out.println(hüseyine);
		System.out.println(pizza1);
		System.out.println(pizza2);
		System.out.println(pizza3);

		System.out.println("--------------------------------");
		// order 159 pizza medium, 2,3
		double totalPrice=0;
		for (int i = 1; i <=159 ; i++) {
			
			Pizza order=new Pizza ();
			order.customOrder("medium", 2, 3);
			totalPrice+=order.calculatePrice();
		}
		System.out.println(totalPrice);
	}

}
