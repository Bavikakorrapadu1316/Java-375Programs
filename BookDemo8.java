package Encapsulation;
public class BookDemo8 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("OOP Concepts");
        book.setAuthor("Author X");
        book.setPrice(600);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());
    }
}