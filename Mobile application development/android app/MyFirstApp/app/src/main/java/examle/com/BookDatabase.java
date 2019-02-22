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

    //Search books by title
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> bookList = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (title.trim().toLowerCase().equals(books.get(i).getTitle().trim().toLowerCase())) {
                bookList.add(books.get(i));
            }
        }
        return bookList;
    }

    //search books by author
    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> bookList = new ArrayList<>();
            for(int i = 0; i < books.size(); i++) {
                if(author.trim().toLowerCase().equals(books.get(i).getAuthor().trim().toLowerCase())) {
                    bookList.add(books.get(i));
                }
        }
        return bookList;
    }

}
