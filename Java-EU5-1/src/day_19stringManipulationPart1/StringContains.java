package day_19stringManipulationPart1;

public class StringContains {

	public static void main(String[] args) {
		String search=" haydi gel gel içelim nefsini alda gel";
		boolean find=search.contains("içelim");
		System.out.println(find);
		System.out.println(search.concat(" neden gelmedin"));
		
		
		
		String email="test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list="tomatos,patatos,eggs,milk,bread,meet,apples";
		if(list.contains("apples")) {
			System.out.println("apples are in the list");
		}else {
			System.out.println("apples are not in the list");
		}
		
		
		boolean haseggs=list.contains("eggs");
		System.out.println("contains eggs :"+haseggs);
		
		
		boolean hasCucumbers= list.contains("cucumber");
				System.out.println("contains cucmbers:"+ hasCucumbers);
		
		
		email="name@yahoo.com";
		
		if(email.contains("yahoo")) {
			System.out.println("yahoo account");
		}else if(email.contains("gmail"))
			System.out.println("gmail account");
		
		
		String etsyTitle="Car | Etsy";
		if(etsyTitle.contains("|")) {
			System.out.println("pipe is there as detected");
		}else {
			System.out.println("pipe is not detected");
		}
		
		
                                                          		
		
	}

	
	
}


