package week4;

public class StringPraacitce2 {

	public static void main(String[] args) {
		String s1="Java";
		String s2=new String("java");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//check only visiible task
		System.out.println(s1.equalsIgnoreCase(s2));
	}

}
