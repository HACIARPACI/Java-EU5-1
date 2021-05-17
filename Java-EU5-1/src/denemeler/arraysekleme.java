package denemeler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class arraysekleme {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 10, 20, 10, 20,10, 20};
		
		ArrayList<Integer> list = new ArrayList<>()	;
		for (int each : numbers) {
			if(!list.contains(each)) {
				list.add(each);
			}
			
			
		}
		
		System.out.println(list);
		ArrayList<String>liste=new ArrayList<>();
		liste.addAll(Arrays.asList("ali","veli","selim","hilmi"));
		System.out.println(liste);
		
	}

}
