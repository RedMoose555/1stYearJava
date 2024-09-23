import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction_Log {
    public static void logPurchase(String itemName, double price, String paymentMethod, double change, double tip) {
        try {
            // Create a SimpleDateFormat object with the desired format
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

            // Get the current date and time
            Date now = new Date();

            // Format the date and time according to the specified pattern
            String formattedDateTime = formatter.format(now);

            FileWriter fw = new FileWriter("purchase_logs.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);

            out.println("Date/Time: " + formattedDateTime);
            out.println("Item: " + itemName);
            out.println("Price: " + price);
            out.println("Payment Method: " + paymentMethod);
            if (paymentMethod.equals("CASH")) {
                out.println("Change: " + change);
            }
            out.println("Tip: " + tip);

            out.println("===============================================");

            out.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to purchase logs.");
        }
    }
}
