import java.util.Scanner;

public class keyboard {
    private Scanner in;

    public keyboard() {
        in = new Scanner(System.in);
    }

    public int readInteger(String promptMsg, String errorMsg, int low, int high) {
        int num = 0;
        String strInput;
        boolean valid = false;

        // Keep looking until valid input
        while (!valid) {
            // Prompt the user
            System.out.print(promptMsg);
            // Grab input from keyboard
            strInput = in.nextLine();
            // Try convert string to integer
            try {
                num = Integer.parseInt(strInput);
                // Check if input is within valid range
                if (num >= low && num <= high) {
                    valid = true;
                } else {
                    System.out.println(errorMsg);
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMsg);
            }
        }
        return num;
    }

    public double readDouble(String promptMsg, String errorMsg, double low, double high) {
        double num = 0;
        String strInput;
        boolean valid = false;

        // Keep looking until valid input
        while (!valid) {
            // Prompt the user
            System.out.print(promptMsg);
            // Grab input from keyboard
            strInput = in.nextLine();
            // Try convert string to double
            try {
                num = Double.parseDouble(strInput);
                // Check if input is within valid range
                if (num >= low && num <= high) {
                    valid = true;
                } else {
                    System.out.println(errorMsg);
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMsg);
            }
        }
        return num;
    }
}
