package day37_inheritence;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {

		// ask user how many question how many missed give user letterGrade
		
		Scanner scan = new Scanner(System.in);
		int questions;
		int missed;
		
		System.out.println(" enter how many questions  in the exam");
		questions=scan.nextInt();
		System.out.println("how many  questons missed");
		missed= scan.nextInt();
		
		FinalExam exam = new FinalExam(questions, missed);
		System.out.println("Grade of the exam is :" +exam.getGrade());
		
		
		
		
	}

}
