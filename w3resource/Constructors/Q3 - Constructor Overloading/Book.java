public class Book {
    private String title;
    private String author;
    private int price;

    // default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    // parametrised constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // constructor overloading
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Sherlock Holmes", "Sir Arthur Conan Doyle");
        Book book2 = new Book("Eragon", "Christopher Paolini", 60);
        System.out.println("Parametrised constructor 1: " + book1.title + " " + book1.author);
        System.out.println("Parametrised constructor 2: " + book2.title + " " + book2.author + " " + book2.price);
    }
}