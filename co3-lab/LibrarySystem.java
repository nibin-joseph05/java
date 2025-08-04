abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }

    public abstract String getType();
}

class Book extends LibraryResource {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "Book";
    }
}

class Magazine extends LibraryResource {
    public Magazine(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "Magazine";
    }
}

class DVD extends LibraryResource {
    public DVD(String title, String author) {
        super(title, author);
    }

    @Override
    public String getType() {
        return "DVD";
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "James Gosling");
        Magazine mag = new Magazine("Tech Monthly", "Jane Doe");
        DVD dvd = new DVD("Inception", "Christopher Nolan");

        System.out.println("Title: " + book.getTitle() + " | Author: " + book.getAuthor() + " | Type: " + book.getType());
        System.out.println("Title: " + mag.getTitle() + " | Author: " + mag.getAuthor() + " | Type: " + mag.getType());
        System.out.println("Title: " + dvd.getTitle() + " | Author: " + dvd.getAuthor() + " | Type: " + dvd.getType());
    }
}
