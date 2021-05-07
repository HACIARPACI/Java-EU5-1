package day15_Part3;

public class MethodOverloading {

	public static void main(String[] args) {

		  
		System.out.println(sum(2,9,6 ));
	int x=	sum(10, 20, 30, 40);
	System.out.println(x);
	}

	public static int sum(int a,int b) {          //sum() olablir bozmaz
	return a+b;	
	}
	public static int sum(int a ,int b,int c) {
	return a +b+c ;
	}
public static int sum(int a, int b,int c, int d) {
	return a+b+c+d;
}
}


/*rules  
1-number of parameters 
add(int,int)
add(int,int,int)
2- data type of paremeter
	add(int,int)
	add(int,float)  acceptable
3- sequence of data type parameters
 	add(int,float)
 	add(float,int)
4- invalid case  ///invalid
	int add(int,int)
	float add(int,int)*/









