//importing the scanner
public class Question1{
public static void main(String args[]){

	//declaring the boolean variables
	Boolean answer1= (2 * 3 == 6 && 4 < 5);
	Boolean answer2=(3 > 1 || 5 < 3);
	Boolean answer3=(1 < 10 && 2 < 10 && 3 < 10);
	Boolean answer4=(!(3 > 10) && 5 != 4);
	Boolean answer5=((10 >= 10) && (11 >= 10));

	//printing the answer
	System.out.println("(2 * 3 == 6 && 4 < 5) is: "+ answer1);
	System.out.println("(3 > 1 || 5 < 3) is: "+ answer2);
	System.out.println("(1 < 10 && 2 < 10 && 3 < 10) is: "+ answer3);
	System.out.println("(!(3 > 10) && 5 != 4) is: "+ answer4);
	System.out.println("((10 >= 10) && (11 >= 10)) is: "+ answer5);
	}
}