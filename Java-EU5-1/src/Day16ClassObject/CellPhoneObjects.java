package Day16ClassObject;

public class CellPhoneObjects {   //ozzy ismini bestbuy koydu

	public static void main(String[] args) {

		CellPhone cell1=new CellPhone();
		System.out.println(cell1.brand);     // cell1 i yazmadan brandý direk caðýramazsýn
		System.out.println(cell1.screenSize);
		cell1.brand="nokia 6300 ";
		cell1.screenSize=2.0;
		cell1.color="silver";
		cell1.price=76.16;
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		System.out.println(cell1.color);
		System.out.println(cell1.price);
		
		cell1.color="black";
		System.out.println(cell1.color); //re assign yapýldýðý için lack gelir
		
		CellPhone cell2=new CellPhone();
		cell2.brand="siemens";
		cell2.screenSize=1.5;
		cell2.color="red";
		cell2.price=39.87;
		System.out.println("***CELL 2 VALUES***");
		System.out.println("Brand:"+cell2.brand);
		System.out.println("ScreenSize:"+cell2.screenSize);
		System.out.println("color:"+cell2.color);
		System.out.println("Price:"+cell2.price);
		
		System.out.println("*****CALLING METHODS******");
		cell1.call();
		cell1.message();
		cell1.takePhoto();
		
		cell2.call();
		cell2.message();
		cell2.takePhoto();
		}
		
		
		
		
	}

	

