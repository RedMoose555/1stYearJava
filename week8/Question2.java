// Importing necessary classes for file handling
import java.io.*;

// Defining a class named Question2
public class Question2 {
    // Method to generate a random password
    public static String generatePassword() {
        // Initializing an empty string to store the generated password
        String password = "";
        // Setting the desired length of the password
        int charLength = 18;

        // Loop to generate each character of the password
        for (int i = 0; i < charLength; i++) {
            // Generating a random ASCII character within the range [32, 127]
            char ascii = (char) ((int) (Math.random() * (127 - 32 + 1)) + 32);
            // Appending the generated character to the password string
            password += ascii;
        }

        // Returning the generated password
        return password;
    }

    // Main method where the program starts its execution
    public static void main(String[] args) {
        // Generating a password using the generatePassword method
        String generatedPassword = generatePassword();

        // Printing the generated password to the console
        System.out.println("Generated Password: " + generatedPassword);

        try {
            // Creating a FileWriter with the filename "password.txt"
            FileWriter fw = new FileWriter("password.txt");
            // Creating a PrintWriter with the FileWriter
            PrintWriter pw = new PrintWriter(fw);

            // Writing 20 randomly generated passwords to the file
            for (int i = 0; i < 20; i++) {
                pw.println(generatePassword());
            }

            // Closing the PrintWriter to ensure data is written to the file
            pw.close();
        } catch (IOException e) {
            // Handling IOException, if any, during file writing
            System.out.println("Error: Cannot write file");
        }
    }
}


