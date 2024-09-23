public class Cash extends Transaction {
    private double amountTendered;
    private double change;

    public Cash(Menu_Item item, double price, double amountTendered, double change) {
        super(item, price);
        this.amountTendered = amountTendered;
        this.change = change;
    }

    @Override
    public void logTransaction(String paymentMethod, double change, double tip) {
        super.logTransaction(paymentMethod, this.change, tip);
    }
}
