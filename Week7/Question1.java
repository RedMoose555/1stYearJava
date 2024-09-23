import java.util.Scanner;
public class Question1{
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);
		System.out.println("Product of four numbers");
		//declaring variables
		int product = 1;

		//loop

		int i=1;
		while(i<=4){
			System.out.println("Enter a number:");
			int num = in.nextInt();
			i = i+1;
			product=product*num;
		}
		System.out.println("Product equals:"+product);
	}
}

