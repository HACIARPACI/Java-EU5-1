package week2Muhtar;

public class ternaryOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=100;
		String result="";
		if (num%2==0) {
			result="even";
		}else {
			result="odd";
		}
		
		System.out.println(result);
		// ternary ile
		String result2=(num%2==0)?"even":"odd";
		int n=100;
		String result3=(n==0)?"zero":(n<0)?"negative":"positive";
		System.out.println(result3);
		
		int d=3;
		String day=(d==1)?"monday":(d==2)?"tuesday":(d==3)?"wednesday":(d==4)?"Thursday":(d==5)?"friday":"invalid";
		System.out.println(day);    // :(  :( else if anlam�na geliyor
		
		int a=10,b=40,c=30;
		int max=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
		System.out.println(max);
		
		int g�n=5;
		String da=(g�n==1)?"ptesi":(g�n==2)?"sal�":(g�n==7)?"pazar":"invalid day";
		System.out.println(da);
		
		int g�l=9;
		
			String gn=(g�l>0&&13>g�l)?(g�l==2)?"28ceker":(g�l==1||g�l==3||g�l==5||g�l==12)?"31 �eker":"30ceker":"invalid";
			System.out.println(gn);
		}
		
		
		
		
		
		
		
	} 


