package examle.com;

public class Book {

    // declaration
    priavte String title;
    private String author;

    //constructor, the value of title & book = empty strings
    public Book() {
        title = "";
        author = "";
    }

    //parameter for user to enter, search by
    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    //getter
    public String getTitle() {

        return title;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;

    }

    //getter
    public String getAuthor() {

        return author;
    }

    //setter
    public void setAuthor(String author) {

        this.author = author;
    }
}
