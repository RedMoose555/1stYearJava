// Importing necessary classes for file handling
import java.io.*;

// Defining a class named Question1
class Question1 {
    // Method to read data from a file and store it in an array
    public static void readFile(String filename, String[] array) {
        try {
            // Creating FileReader and BufferedReader objects to read the file
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            // Reading each line from the file and storing it in the array
            for (int i = 0; i < array.length; i++) {
                array[i] = br.readLine();
            }
        } catch (IOException e) {
            // Handling IOException, if any, during file reading
            System.out.println("Error! Cannot read from " + filename);
        }
    }

    // Main method where the program starts its execution
    public static void main(String args[]) {
        // Creating an array to store data from the first file
        String[] array = new String[7];
        // Calling the readFile method to read data from the first file
        readFile("names/names.txt", array);

        // Creating another array to store data from the second file
        String[] array2 = new String[7];
        // Calling the readFile method to read data from the second file
        readFile("descriptions/descriptions.txt", array2);

        // Displaying the contents of both arrays in the console
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println(array2[i]);
        }
    }
}
