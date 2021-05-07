package day5_unary_operators;

public class unaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=+10;
		int i2=-100;
		int i3 =-(i1+i2);
		System.out.println("i1="+i1);
		System.out.println("i2="+i2);
		System.out.println("i3="+i3);
		boolean flag = true ;
		System.out.println(!flag);
		System.out.println(!!flag);
		
		int i=10, j=5;
		i++;// alttaki satýrda oldugu için 11 oldu
		--j; 
		System.out.println("i="+i++);
		System.out.println("j="+j);
		//i11 j4
		int res= i++ + --j; 
		System.out.println("res="+res);//14
		
		
		
		
		
		
		
	}

}
