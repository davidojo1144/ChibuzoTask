import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{

public static void main(String...args){

	Scanner sc = new Scanner(System.in);

	System.out.println("How many student do you have: ");
	int students = sc.nextInt();

	System.out.println("How many subject do they offer: ");
	int subject = sc.nextInt();

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully");
	System.out.println();

	int[][] scores = new int[students][subject];
	int[] allTotal = new int[students];
	double[] average =new double[students];
	int[] position = new int[students]; 

	
	for (int count = 0; count < students; count++){
		int total = 0;
		for ( int counter = 0; counter < subject; counter++){

		System.out.println("Entering score for student: " + (count+1) + " ");
		System.out.println("Enter score for subject: " + (counter+1) + " ");
		int figure = sc.nextInt();
		scores[count][counter] = figure;
		total += figure;

		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
		System.out.println();
		
		}

	}
}

}