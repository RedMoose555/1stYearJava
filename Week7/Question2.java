import java.util.Scanner;
public class Question2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		//Declaring variables and user input
		int num;
		System.out.println("Enter number of rows N: ");
		num=in.nextInt();
		System.out.println();
		//outer loop( rows )
		for(int i=1 ; i <=num ; i++){
			//inner loop ( value within rows )
			for(int j=1; j<=i ; j++)
				System.out.print(i*j+" ");

			System.out.println();

		}
	}
}



