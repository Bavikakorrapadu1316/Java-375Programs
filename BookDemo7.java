package Encapsulation;
class Book {
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

public class BookDemo7 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Java Basics");
        book.setAuthor("James Gosling");
        book.setPrice(500);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}