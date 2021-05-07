package day26arraysPart3;

public class task93Split {

	public static void main(String[] args) {


		String str = "As he crossed toward the pharmacy at the corner he involuntarily turned his head"
                + " because of a burst of light that had ricocheted from his temple,"
                + " and saw, with that quick smile with which we greet a rainbow or a rose,"
                + " a blindingly white parallelogram of sky being unloaded from the van a dresser"
                + " with mirrors across which, as across a cinema screen,"
                + " passed a flawlessly clear reflection of boughs sliding and swaying not arboreally,"
                + " but with a human vacillation, produced by the nature of those who were carrying this sky,"
                + " these boughs, this gliding façade.";

		String[] array = str.split(" ");
		String hacý =array[2].substring(3);
		System.out.println(hacý); 
		System.out.println(str.indexOf("paral"));
		System.out.println(array.length);
		

	//	System.out.println(array[95]);
	/*	for (String value : array) {
			System.out.println(value);
		}*/
		
		
		
	}

}
