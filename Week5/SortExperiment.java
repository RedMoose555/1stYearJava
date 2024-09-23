import java.util.Random;
import java.util.Arrays;

public class SortExperiment{

	// Method to generate a random array with a seed value
	public static int[] makeRandomArray(int size, int min, int max, int seed){
		// Make a random generator
		Random rnd = new Random(seed);
		// Make a local array variable
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++){
			array[i] = rnd.nextInt(max - min) + min;
		}
		return array;

	}

	// Method to print an integer array
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// TODO *
	// Add the selectionSort method here !!
	public static void selectionSort(int[] array){//Creating the selection sort array
		for(int i = 0; i < array.length; i++){//defining the start, guard and action for the outer loop
			int k = i;//defining k as i in order to switch using the sorted value
			for(int j = i + 1; j < array.length; j++){//defining the start, guard and action for the inner loop
				if( array[j] < array[k])//if the array at index j is less than array at index k, k will be switched the number j
				k = j;
			}
			int temp = array[i];//switching the temp value into array at index i, sorting it
			array[i] = array[k];//switching the array at index i value into array at index k, sorting up
			array[k] = temp;//switching the array at index k value into the temp value, sorting it
		}
	}


	// TODO *
	// Add the bubbleSort method here !!
	public static void bubbleSort(int[] array){//Creating the Bubble sort array
		for(int i = 0; i < array.length; i++){//defining the start, guard and action for the outer loop
			for(int j = 1; j < (array.length-i); j++){//defining the start, guard and action for the inner loop
				if(array[j-1] > array[j]){//if the array at index one less than j is bigger than array j
					int temp = array [j-1];//creating a temporary variable that's equal to array at index one less than j
					array [j-1] = array[j];//array at index one less than j will be switched into array at index j
					array[j] = temp;// array at index j will be defined as the temp variable, which is array at index one less than j
				}
			}
		}
	}



	public static void main(String[] args) {

		// Generate an array of containing random numbers between 1 - 100 inclusive
		// NOTE: the random number generator will be seeded to produce the same random
		// array each time.

		// TODO:
		// Modify the calls to makeRandomArray to generate arrays of size 10,0000
		int[] sArray = makeRandomArray(100000, 1, 101, 5);
		int[] bArray = makeRandomArray(100000, 1, 101, 5);
		int[] aArray = makeRandomArray(100000, 1, 101, 5);

		// Print the arrays - before the sort
		System.out.println("Selection sort array before sorting.....");
		printArray(sArray);
		System.out.println("Bubble sort array before sorting.....");
		printArray(bArray);
		System.out.println("Imported sort array before sorting.....");
		printArray(aArray);

		long start, end, sRuntime, bRuntime, aRuntime;//declaring the start, end variables alongside with the runtimes for each sorting method

		// TODO *
		// Sort the selectionArray array using selectionSort and calculate the runtime


		// TODO *
		// Sort the bubbleArray array using bubbleSort and calclate the runtime


		// TODO *
		// Print arrays to confirm they are sorted
		//Selection Sort
		System.out.println("Selection sort after sorting:");
		start = System.currentTimeMillis();//getting the current time of the machine in ms before running the algorithm
		selectionSort(sArray);//initializing the sArray with the selection sort method
		end = System.currentTimeMillis();//getting the current time of the machine in ms after running the algorithm
		sRuntime = end-start;//calculating the total time it took to run the algorithm by taking away the end time from the start time
		printArray(sArray);//printing out the array after impimenting the selection sort method


		//Bubble Sort
		System.out.println("Bubble sort after sorting:");
		start = System.currentTimeMillis();//getting the current time of the machine in ms before running the algorithm
		bubbleSort(bArray);//initializing the bArray with the bubble sort method
		end = System.currentTimeMillis();//getting the current time of the machine in ms after running the algorithm
		bRuntime = end-start;//calculating the total time it took to run the algorithm by taking away the end time from the start time
		printArray(bArray);//printing out the array after implimenting the bubble sort method



		//aArray sort using imported feature
		System.out.println("Imported sort after sorting:");
		start = System.currentTimeMillis();//getting the current time of the machine in ms before running the algorithm
		Arrays.sort(aArray);//Sort the aArray with the imported Arrays.sort method
		end = System.currentTimeMillis();//getting the current time of the machine in ms after running the algorithm
		aRuntime = end-start;//calculating the total time it took to run the algorithm by taking away the end time from the start time
		printArray(aArray);//printing out the array after implimenting the imported Array.sort method
		System.out.printf("The time it took to complete the Selection Sort algorithm: %d ms. \n",sRuntime);//printing the time it took to complete the algorithm using the selection sort
		System.out.printf("The Time it took to complete the Bubble sort algorithm: %d ms. \n",bRuntime);//printing the time it took to complete the algorithm using the bubble sort
		System.out.printf("The time it took to complete the Arrays algorithm: %d ms.",aRuntime);//printing the time it took to complete the algorithm using the Array.sort method
	}
}
