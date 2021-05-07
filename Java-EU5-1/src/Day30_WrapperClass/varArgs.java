package Day30_WrapperClass;

public class varArgs {

	public static void main(String[] args) {

		sum(2,4);
		sum(2,3,4,5,6);
		concat("apple","orange","123","result");
		System.out.println(concat("apple","orange","123","result"));
		
	}

	
	public static void sum(int... numbers) { // vararg parameter can take avariable number of element	
		
		int sum=0;
		
		
		for (int value : numbers) {
			sum+=value;
			
		}
		
		System.out.println(sum);
	}
	public static String concat(String... strs) {
		String newStr="";
		for (String str : strs) {
			
			newStr+=str.charAt(2);
		}
		
		return newStr;
		
		
	}
	
}
