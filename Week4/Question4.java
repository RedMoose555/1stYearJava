//importing scanner
import java.util.Scanner;
public class Question4{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		//getting user input and declaring the variables
		System.out.println("Enter length of line A: ");
		int a= in.nextInt();

		System.out.println("Enter length of line B: ");
		int b= in.nextInt();

		System.out.print("Enter length of line C: ");
		int c = in.nextInt();

		//checking if the three lines make a triangle
		if (a+b>c && b+c>a && c+a>b)
			System.out.println("TRIANGLE");

		else
			System.out.println("NOT A TRIANGLE");
	}
}
