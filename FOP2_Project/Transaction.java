import java.util.Date;

public class Transaction {
    private Date timestamp;
    private Menu_Item item;
    private double price;

    public Transaction(Menu_Item item, double price) {
        this.timestamp = new Date();
        this.item = item;
        this.price = price;
    }

    public String getItemName() {
        return item.getName();
    }

    public double getPrice() {
        return price;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void logTransaction(String paymentMethod, double change, double tip) {
        Transaction_Log.logPurchase(getItemName(), getPrice(), paymentMethod, change, tip);
    }
}
