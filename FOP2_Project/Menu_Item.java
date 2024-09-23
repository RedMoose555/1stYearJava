import java.io.*;
import java.util.ArrayList;

public class Menu_Item {
    private String name;
    private double price;

    public Menu_Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void readInventoryFile(String filename, ArrayList<Menu_Item> items) {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String tokens[] = line.split(",");
                String name = tokens[0];
                double price = Double.parseDouble(tokens[1]);
                items.add(new Menu_Item(name, price));
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error, cannot read from " + filename);
        }
    }

    public static void main(String[] args) {
        ArrayList<Menu_Item> items = new ArrayList<>();
        readInventoryFile("Menu_List.txt", items);
        for (Menu_Item item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
    }
}
