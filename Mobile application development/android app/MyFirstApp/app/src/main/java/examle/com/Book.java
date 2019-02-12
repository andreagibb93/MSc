package examle.com;

public class Book {

    //
    priavte String title;
    private String author;

    //constructor
    public Book() {
        title = "";
        author = "";
    }

    //parameter for user to enter, search by
    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public String getAuthor() {
        return author;
    }

    publuc void setAuthor(String author) {
        this.author = author;
    }
}
