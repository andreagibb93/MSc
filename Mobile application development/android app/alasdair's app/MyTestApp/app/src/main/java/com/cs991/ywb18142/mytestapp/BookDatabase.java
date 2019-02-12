package com.cs991.ywb18142.mytestapp;

import java.util.ArrayList;

public class BookDatabase {

    ArrayList<Book> books;

    public BookDatabase() {

        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {

        return books;
    }

    public void addBook(Book book) {

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

    //Search books by author
    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> bookList = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (author.trim().toLowerCase().equals(books.get(i).getAuthor().trim().toLowerCase())) {
                bookList.add(books.get(i));
            }
        }
        return bookList;
    }

}
