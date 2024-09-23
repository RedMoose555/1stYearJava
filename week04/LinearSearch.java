// Define a class named LinearSearch
public class LinearSearch {

    // Method to print the elements of an array
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s ", array[i]); // Print each element followed by a space
        }
        System.out.println(); // Move to the next line after printing all elements
    }

    // Method to perform a rightmost linear search in an array
    public static int rightMostSearch(String[] array, String searchKey) {
        int rightMostIndex = -1; // Initialize the rightmost index to -1 (not found)
        for (int i = 0; i < array.length; i++) { //Go through each array index
            if (array[i].equals(searchKey)) //Compare the array at index[i] to the searchKey
                rightMostIndex = i; // Update the rightmost index if a match is found
        }
        return rightMostIndex; // Return the rightmost index (or -1 if not found)
    }

    // Main method where the program execution begins
    public static void main(String[] args) {
        String[] words = {"cat", "hat", "mat", "bat", "hat", "sat"}; // Array of words
        String searchKey = "hat"; // Word to search for
        printArray(words); // Print the array of words
        int rightMostIndex = rightMostSearch(words, searchKey); // Perform rightmost search
        if (rightMostIndex >= 0) {
            System.out.printf("Rightmost %s found at index %d", searchKey, rightMostIndex);
            System.out.println(); // Move to the next line after printing the result
        } else {
            System.out.printf("Couldn't find the word %s", searchKey);
        }
    }
}

