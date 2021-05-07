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
		System.out.println(day);    // :(  :( else if anlamýna geliyor
		
		int a=10,b=40,c=30;
		int max=(a>b&&a>c)?a:(b>a&&b>c)?b:c;
		System.out.println(max);
		
		int gün=5;
		String da=(gün==1)?"ptesi":(gün==2)?"salý":(gün==7)?"pazar":"invalid day";
		System.out.println(da);
		
		int gül=9;
		
			String gn=(gül>0&&13>gül)?(gül==2)?"28ceker":(gül==1||gül==3||gül==5||gül==12)?"31 çeker":"30ceker":"invalid";
			System.out.println(gn);
		}
		
		
		
		
		
		
		
	} 


