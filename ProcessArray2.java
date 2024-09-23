public class ProcessArray2 {

    // Main
    public static void main(String[] args) {
        // Declare empty array
        int[] myData;
        // Create array
        myData = makeRandomArray(200, 100, 1);
        // Print array
        printArray(myData);
        // Sum the array
        System.out.printf("Array sum %d\n", sumArray(myData));
        // Average the array
        System.out.printf("Array average %.2f\n", averageArray(myData));
        // Find frequency of 10
        System.out.printf("The frequency of 10 is %d\n", frequency(10, myData));
        // Zero the array
        zeroArray(myData);
        // Print the array
        printArray(myData);
    }//End of main


    // Generating our random array
    public static int[] makeRandomArray(int size, int upper, int lower) {
    	//Creating an array of zeros
        int[] array = new int[size];
        //Going through each element of the array and assigning a random value
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(upper-lower+1)) + lower;
        }
        return array;
    }//End of makeRandomArray


    // Printing the array
    public static void printArray(int[] array) {
    	//Going through each value of the array and printing them
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }//End of printArray


    // Claculating the sum of the array
    public static int sumArray(int[] array) {
        int sum = 0;
        //Summing each value of the array
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }//End of sumArray

    // Calculating the average of the array
    public static double averageArray(int[] array) {
        double sum = sumArray(array);
        double average = sum / array.length;
        return average;
    }//End of averageArray

    // Calculating the frequency of the number 10
    public static int frequency(int target, int[] array) {
        int frequency = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                frequency++;
            }
        }
        return frequency;
    }//End of frequency

    // Setting array int value to zero
    public static void zeroArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }//End of zeroArray

}//End of Class
