//importing scanner
import java.util.Scanner;
public class Question2{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);

		//getting user input & declaring the variable
		System.out.println("Please eneter your number: ");
		int num = in.nextInt();

		//checking if the number is either positive, negative or zero and printing the answer
		if (num >0)
			System.out.println("positive");

		else if (num<0)
			System.out.println("negative");

		else
			System.out.println("Zero");
	}
}