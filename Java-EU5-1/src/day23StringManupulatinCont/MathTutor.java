package day23StringManupulatinCont;

import java.util.Random;
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {

	int num1;	
	int num2;
	int sum;
	int userAnswer;
		
	Scanner sc=new Scanner(System.in);
	Random rn=new Random();
		
	
	
	num1= rn.nextInt(100);
	num2=rn.nextInt(100);
	
	System.out.println("whats the answer to the following proble?m");
	System.out.println(num1+"+"+num2+" =?");
	
	userAnswer=sc.nextInt();
	sum=num1+num2;
	if(userAnswer==sum) {
		
		System.out.println("correct you got it");
		
		
	}else {
		System.out.println("sorry wrong answer, correct answer is :"+sum);
	}
	
	
	
	}

}
