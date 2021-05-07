package day20Stringpart2;

public class StringIndexOf {

	public static void main(String[] args) {

		String word1= "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("thub"));
		
		System.out.println(word1.indexOf("java"));
		
		String url= "www.okta.com";
		int i =url.indexOf(".");
		System.out.println("pos of . :"+i);
		System.out.println(url.charAt(i+1));
		
		//find the position of'-'  and check if space is on right and left side
		
		String title="Java - Google Search";
		int dash=title.indexOf("-");
		System.out.println(title.indexOf("-"));
		
		System.out.println(title.charAt(dash-1));
		System.out.println(title.charAt(dash+1));
		
		System.out.println("apple");
		
		String country="united states of america";
		int states= country.indexOf("states");
		System.out.println("position of satates:"+states);
		
		String word2= "java, c++, phyton, tomcat, eclipse";
		// check if c++ is in the word2
		if (word2.contains("c++")) {
			System.out.println("c++is there");
		}
		
		// 2 index of
		if(word2.indexOf("c++")>-1) {   //yoksa -1 verir ordan yaptý
		System.out.println("c++ is there");
		}else {
		System.out.println("c++ is not there");
	}

}
}