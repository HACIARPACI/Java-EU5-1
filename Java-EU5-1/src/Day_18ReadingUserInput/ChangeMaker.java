package Day_18ReadingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		// enter 1-99 find combinations that equals amount of change	
		//quarter:25 cents
		//dimes:10 cents
		//nickles:5 cents
		//pennies:1 cent
	
  Scanner keyboard= new Scanner(System.in);
  System.out.println("enter a number from 1-99");
 int attemp=0;
  
  do { 
	  int user_amount= keyboard.nextInt();
	  if (user_amount>1&&user_amount<100) {
		  changeMaker(user_amount);
	  break;
	  }else {
		  attemp++;
	  
		  if(attemp==3) {  // counter olayına iyi bak sık kullanılıyor
			  System.out.println("sorry no more attemp");
			  break;
		  }else {
			  System.out.println("try again");
		  }
	  } 
  }  while(true);
	}
  public static void changeMaker(int amount) {
  int originalAmount=amount;
  int quarter=amount/25;//87
  amount=amount%25;//12
  int dimes =amount/10;//1
  amount=amount%10;//2
  int nickles=amount/5;//2/5=0
  amount=amount%5;
  int pennies=amount;//2
  
  System.out.println(originalAmount+"cents in coins can be given as");
  System.out.println(quarter+" quarters");
  System.out.println(dimes+" dimes");
  System.out.println(nickles+"nickles");
  System.out.println(pennies+"pennies");
  
	}
	
	

}
