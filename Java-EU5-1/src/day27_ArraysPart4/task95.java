package day27_ArraysPart4;


public class task95 {

	public static void main(String[] args) {

		int [][]notes= {{60,75,54,80},{100,64,20,50},{10,35,40,90}};
		double avarage=0;
		double sum=0;
		for (int i = 0; i < notes[0].length; i++) {
			sum+=notes[0][i];
		
		}
		System.out.println("student1 avarage is :"+(sum/notes[0].length));
		int sum2=0;
		for (int i = 0; i < notes.length; i++) {
			sum2+=notes[i][0];
		}
			System.out.println(sum2);
		}
	}


