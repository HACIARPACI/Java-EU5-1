package Day30_WrapperClass;

public class boxing {

	public static void main(String[] args) {
		// auto boxing primitive to object
		Integer num1=123;
		int n=5;
		Integer num2=n;
		
		//unbox   object to primitive
		
		Double d1=new Double(34.2);
		double d2= d1;
		System.out.println("d1:"+d1);
		System.out.println("d2"+d2);
		
		long l1=new Long(60000L);   // unbox
		Long l2=new Long(32165354); // no box
		
		long l3= l2; //unbox
		
		
		
	Integer num3=Integer.valueOf(345);
//	Double d3=num3;// casting not possible with Wrapper
	
	
	
	
	}

}
