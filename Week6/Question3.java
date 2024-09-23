import java.util.Scanner;
public class Question3{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);

		//user input and variables
		System.out.println("Enter capital to invest:");
		double capital= in.nextDouble();
		double cumulative =0;

		//Loop
		for (int year = 1; year<=6 ; year++){
		double interest =(capital*0.125);
		cumulative += interest;
		capital += interest;

		//Printing the answers
		System.out.printf("Year %d: \n Interest: %.2f Cumulative interest: %.2f Capital: %.2f \n",year,interest,cumulative,capital);
		}
	}
}

