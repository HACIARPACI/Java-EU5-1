package Assignment10;

public class q24 {

	public static void main(String[] args) {

		 
        String input = "What's the difference between java, javascript and python?";
        
        int countJava = Q19_numberOfJava.wordCounter(input, "java");
        System.out.println("java: " + countJava);
        
        int countPython = Q19_numberOfJava.wordCounter(input, "python");
        System.out.println("python: " + countPython);
        
        if (countJava==countPython) {
            System.out.println("output: " + true);
        } else {
            System.out.println("output: " + false);
        }
    }
		
	}


