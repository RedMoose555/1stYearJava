// Class representing a Book with title, author, and publication year
class Book {
    // Instance variables to store book details
    private String title;  // Title of the book
    private String author; // Author of the book
    private int year;      // Publication year of the book

    // Method to set the title of the book
    public void setTitle(String t) {
        title = t;
    }

    // Method to get the title of the book
    public String getTitle() {
        return title;
    }

    // Method to set the author of the book
    public void setAuthor(String a) {
        author = a;
    }

    // Method to get the author of the book
    public String getAuthor() {
        return author;
    }

    // Method to set the publication year of the book
    public void setYear(int y) {
        year = y;
    }

    // Method to get the publication year of the book
    public int getYear() {
        return year;
    }
} // End of Book class

// Class to test the functionality of the Book class
public class TestBook {
    public static void main(String[] args) {
        // Create and set up book1
        Book b1 = new Book();
        b1.setTitle("Ulysses");
        b1.setAuthor("James Joyce");
        b1.setYear(1921);

        // Create and set up book2
        Book b2 = new Book();
        b2.setTitle("Dracula");
        b2.setAuthor("Bram Stoker");
        b2.setYear(1897);

        // Printing out details of book1
        System.out.println("Book Object 1:");
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Year: " + b1.getYear());

        System.out.println(); // Line break

        // Printing out details of book2
        System.out.println("Book Object 2:");
        System.out.println("Title: " + b2.getTitle());
        System.out.println("Author: " + b2.getAuthor());
        System.out.println("Year: " + b2.getYear());
    }
}
