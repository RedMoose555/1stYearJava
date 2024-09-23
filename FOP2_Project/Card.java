import java.util.Scanner;

public class Card extends Transaction {
    private String cardType;

    public Card(Menu_Item item, double price, String cardType) {
        super(item, price);
        this.cardType = cardType;
    }

    @Override
    public void logTransaction(String paymentMethod, double change, double tip) {
        super.logTransaction(cardType, 0, tip); // No change for card transactions
    }
}
