class keyboard_test{
	public static void main(String[] args){
		//Create Keyboard object
		keyboard kb = new keyboard();

		//Read Integer
		int intInput;
		String promptMsg1 = "Enter an integer value: ";
		String errorMsg1 = "Invalid entry, enter an integer value: ";

		intInput = kb.readInteger(promptMsg1,errorMsg1);

		System.out.println("You've entered the value: " + intInput);

		//Read Double
		double DoubleInput;
		String promptMsg2 = "Enter an Double value: ";
		String errorMsg2 = "Invalid entry, enter an Double value: ";

		DoubleInput = kb.readDouble(promptMsg2,errorMsg2);

		System.out.println("You've entered the value: " + DoubleInput);

		//Read low & high
		int intInput2;
		String promptMsg3 = "Enter an integer value in the range (1-10): ";
		String errorMsg3 = "Invalid entry, enter an integer value in the range (1-10): ";

		intInput2 = kb.readInteger(promptMsg3,errorMsg3, 1, 10);

		System.out.println("You've entered the value: " + intInput2);

	}
}