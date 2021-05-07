package Day30_WrapperClass;

public class parsingValues {

	public static void main(String[] args) {
		String numberAsString="2018";
		System.out.println(numberAsString);
		int number= Integer.parseInt(numberAsString); //parse edince integer gibi toplayabiliyor.
		System.out.println(number);

		numberAsString= numberAsString+1;
		number=number+1;
		System.out.println(numberAsString);
		System.out.println(number);
		
		double num2=Double.parseDouble(numberAsString);
		System.out.println(num2);
		
		int i=10;
		String s=String.valueOf(i);
		System.out.println(s);// it will return as a String
		
		String s2=Integer.toString(i);// another way to create
		System.out.println(i);// it will retun 10
		
		String S="2000";
		System.out.println(S+1);
		int SA=Integer.parseInt(S);
		System.out.println(SA+1);
		
		
		
		
	}

}
