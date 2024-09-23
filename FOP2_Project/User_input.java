import java.util.Scanner;

public class User_input {
    private Scanner in;

    public User_input() {
        in = new Scanner(System.in);
    }

    public int readInteger(String promptMsg, String errorMsg, int low, int high) {
        int num;
        while (true) {
            try {
                System.out.print(promptMsg);
                num = Integer.parseInt(in.nextLine());
                if (num >= low && num <= high) {
                    return num;
                } else {
                    System.out.println(errorMsg);
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMsg);
            }
        }
    }
}
