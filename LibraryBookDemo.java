package Encapsulation;
class LibraryBook {
    private String title;
    private String author;
    private double price;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

public class LibraryBookDemo {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook();
        book.setTitle("Java Programming");
        book.setAuthor("Author X");
        book.setPrice(700);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
    }
}