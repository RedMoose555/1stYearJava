import java.util.ArrayList;

public class Shop {
    public static void displayMenu(ArrayList<Menu_Item> items) {
        // Display Menu
        System.out.println("M E N U");
        System.out.println("================");
        // Loop through options and items
        for (int i = 0; i < items.size(); i++) {
            Menu_Item item = items.get(i);
            System.out.printf("%d. %-20s %.2f\n", i + 1, item.getName(), item.getPrice());
        }
        // Print the Exit option
        System.out.printf("%d. Exit \n", items.size() + 1);
        System.out.println("========================");
    }

    public static void completeTransaction(int choice, ArrayList<Menu_Item> items) {
        if (choice >= 1 && choice <= items.size()) {
            Menu_Item item = items.get(choice - 1);
            System.out.println("You chose: " + item.getName());

            // Ask for payment method
            System.out.println("Payment Method:");
            System.out.println("1. CASH");
            System.out.println("2. CARD");
            System.out.print("Enter your choice: ");

            // Create a keyboard object for input validation
            keyboard key = new keyboard();
            int paymentChoice = key.readInteger("Enter your choice: ", "Invalid input. Please enter 1 for CASH or 2 for CARD.", 1, 2);

            if (paymentChoice == 1) {
                // Payment with Cash
                double cashAmount = -1;
                while (cashAmount < 0) {
                    cashAmount = key.readDouble("Enter cash amount: ", "Invalid input. Please enter a valid cash amount.", 0, Double.MAX_VALUE);
                }

                // Check if the cash is sufficient
                if (cashAmount >= item.getPrice()) {
                    double change = cashAmount - item.getPrice();

                    // Ask for tip
                    System.out.print("Enter tip amount: ");
                    double tip = key.readDouble("Enter tip amount: ", "Invalid input. Please enter a valid tip amount.", 0, Double.MAX_VALUE);

                    System.out.printf("Transaction successful. Here is your %s\n", item.getName());

                    // Log transaction
                    Transaction transaction = new Cash(item, item.getPrice(), cashAmount, change);
                    transaction.logTransaction("CASH", change, tip);

                    if (change > 0) {
                        System.out.printf("Your change: %.2f\n", change);
                    }
                } else {
                    System.out.println("Insufficient cash. Please choose a different coffee.");
                }
            } else if (paymentChoice == 2) {
                // Payment with Card
                int cardTypeChoice = key.readInteger("Enter card type: 1 for Visa, 2 for Mastercard: ", "Invalid input. Choose 1 for Visa or 2 for Mastercard", 1, 2);
                String cardType = (cardTypeChoice == 1) ? "Visa" : "Mastercard";

                // Ask for tip
                System.out.print("Enter tip amount: ");
                double tip = key.readDouble("Enter tip amount: ", "Invalid input. Please enter a valid tip amount.", 0, Double.MAX_VALUE);

                System.out.println("Transaction successful. Here is your " + item.getName());

                // Log transaction
                Transaction transaction = new Card(item, item.getPrice(), cardType);
                transaction.logTransaction(cardType, 0, tip);
            }
        } else {
            System.out.println("Error: Invalid input. Please choose a valid option.");
        }
    }

    public static void main(String[] args) {
        // User choice
        int choice;

        // Menu data
        ArrayList<Menu_Item> menuItems = new ArrayList<Menu_Item>();

        // Read data from a file
        Menu_Item.readInventoryFile("Menu_List.txt", menuItems);

        // Exit option
        int EXIT = menuItems.size() + 1;

        // Display menu
        displayMenu(menuItems);

        // Get choice from user
        keyboard key = new keyboard();
        choice = key.readInteger("Enter choice: ", "Error: invalid input.", 1, EXIT);

        // Menu Loop
        while (choice != EXIT) {
            // Check choice value
            completeTransaction(choice, menuItems);

            // Display Menu
            displayMenu(menuItems);

            // Get choice from user
            choice = key.readInteger("Enter choice: ", "Error: invalid input.", 1, EXIT);
        }
        System.out.println("Goodbye");
    }
}
