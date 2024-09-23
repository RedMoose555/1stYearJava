//importing scanner
import java.util.Scanner;
public class Question1{
	public static void main (String agrs[]){
	Scanner in = new Scanner (System.in);

	//Getting user input
	System.out.println("Please enter a number between 1-100:");
	int num = in.nextInt();

	//declaring variables
	int tens =(num/10);
	int units =(num%10);

	//nested if statements leading to output
	if (num>=1 && num<=100){
		//special cases
		if (num>=11 && num<=19){
			if (num==10)
				System.out.print("Ten");
			else if (num==11)
				System.out.print("Eleven");
			else if (num==12)
				System.out.print("Twelve");
			else if (num==13)
				System.out.print("Thirteen");
			else if (num==14)
				System.out.print("Fourteen");
			else if (num==15)
				System.out.print("Fifteen");
			else if (num==16)
				System.out.print("Sixteen");
			else if (num==17)
				System.out.print("Seventeen");
			else if (num==18)
				System.out.print("Eighteen");
			else if (num==19)
				System.out.print("Nineteen");
		}
		else{
			if (tens==2)
				System.out.print("Twenty ");
			else if (tens==3)
				System.out.print("Thirty ");
			else if (tens==4)
				System.out.print("Forty ");
			else if (tens==5)
				System.out.print("Fifty ");
			else if (tens==6)
				System.out.print("Sixty ");
			else if (tens==7)
				System.out.print("Seventy ");
			else if (tens==8)
				System.out.print("Eighty ");
			else if (tens==9)
				System.out.print("Ninety ");
			else if (tens==10)
				System.out.print("One Hundred");

			if (units==1)
				System.out.print("one");
			else if (units==2)
				System.out.print("two");
			else if (units==3)
				System.out.print("three");
			else if (units==4)
				System.out.print("four");
			else if (units==5)
				System.out.print("five");
			else if (units==6)
				System.out.print("six");
			else if (units==7)
				System.out.print("seven");
			else if (units==8)
				System.out.print("eight");
			else if (units==9)
				System.out.print("nine");
			}
		}
	else
		System.out.println("Invalid Number!");
	}
}



