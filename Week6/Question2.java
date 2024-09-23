public class Question2{
	public static void main(String args[]){
	//Declaring variables
	int i;
	int roll;
	//Making a loop & Declaring roll value (random between 1-8)
	for(i=0; i<6 ; i= i+1){
		roll = (int)(Math.random()*8+1);
		System.out.printf("Roll: %d You got a %d \n",i+1, roll);
		}
	}
}




