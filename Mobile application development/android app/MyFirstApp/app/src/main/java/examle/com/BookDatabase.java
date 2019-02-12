package examle.com;

import java.util.ArrayList;

public class BookDatabase {

    //declaration
    ArrayList<Book> books;

    //constructor, make new empty list
    public BookDatabase() {
        books = new ArrayList<>();
    }

    //getter for books
    public ArrayList<Book> getBooks() {
        return books;
    }

    //add a book via user input
    public void addBook(Book book){
        books.add(book);
    }
    //search method
    public Book search(String title) {
        if (int i = 0; < books.size(); i++) {
            if(title.trim().toLowerCase().equals(books.get(i).getTitle().trim().toLowerCase()) {
                return books.get(i);
            }

        } // if no matches return null
        return null;
    }

}
