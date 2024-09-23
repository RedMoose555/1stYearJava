//importing scanner
import java.util.Scanner;
public class Question2{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		//Declare variables
			double side1;
			double side2;
			double side3;
		//Get input from user
			System.out.println("Enter length of line A: ");
				side1= in.nextDouble();
			System.out.println("Enter length of line B: ");
				side2= in.nextDouble();
			System.out.println("Enter length of line C: ");
				side3= in.nextDouble();

		//Processing and output
			//Triangle or not
			if (side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
				System.out.print("Triangle, ");
				//Equilateral or not
					if (side1==side2 && side2==side3 && side3==side1)
						System.out.print("Equilateral.");

					else{
						 if (side1==side2 || side2==side3 || side3==side1)
							System.out.print("Isosceles, ");

						else
							System.out.print("Scalene, ");
						//Right angled or not
						if (((side1*side1)+(side2*side2)==(side3*side3)) || ((side2*side2)+(side3*side3)==(side1*side1)) || ((side3*side3)+(side1*side1)==(side2*side2)))
							System.out.print("Right angled.");

						else
							System.out.print("Not right angled.");
						}
			}
			else
				System.out.print("Not a triangle");
	}
}
