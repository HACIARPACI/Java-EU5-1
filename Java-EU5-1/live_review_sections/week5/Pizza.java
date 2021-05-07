package week5;

public class Pizza {

  /*  Pizza:
        attribue:
            size
            cheeseTopping											small 10 medium 12 large 14$
            pepperoniTopping										

        Actions:
            setInfo(), calculatePrice(), toString()*/
	public String size;
	public int cheeseTopping;
	public int pepperoniTopping;
	
	
	public void customOrder(String pizzaSize, int cheese, int pepperoni) {
		size=pizzaSize;
		cheeseTopping=cheese;
		pepperoniTopping=pepperoni;
	}
	public double calculatePrice() {
		int startingPrice=(size.equals("small"))?10:(size.equals("medium"))?12:14;
		
		int totalPriceOfCheese=1*cheeseTopping;
		int totalPriceOfPepperoni=2*pepperoniTopping;
		
		return startingPrice+totalPriceOfCheese+totalPriceOfPepperoni;
		
	}
	public String toString() {
		return "Pizza [size=" + size + ", cheeseTopping=" 
	+ cheeseTopping + ", pepperoniTopping=" + pepperoniTopping
				+", total price=$"+calculatePrice()+ "]";
		
		
	}
	
	
	
	
}
