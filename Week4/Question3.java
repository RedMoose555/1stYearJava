//importing scanner
import java.util.Scanner;

public class Question3{
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);

	//getting user input and declaring the variable
	System.out.println("Please eneter your grade 0-100 ");
	int grade = in.nextInt();

	//translating the number input into a grade and printing it
	if (grade >=80 && grade<=100)
		System.out.println("A");

	else if (grade >=70 && grade <=79)
		System.out.println("B+");

	else if (grade >=60 && grade <=69)
		System.out.println("B");

	else if (grade >=55 && grade <=59)
		System.out.println("B-");

	else if (grade >=50 && grade <=54)
		System.out.println("C+");

	else if (grade >=40 && grade <=49)
		System.out.println("C");

	else if (grade >=35 && grade <=39)
		System.out.println("D");

	else
		System.out.println("F");
	}
}