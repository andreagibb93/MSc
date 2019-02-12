package com.cs991.ywb18142.mytestapp;

public class Book {

    private String title;
    private String author;

    public Book() {
        title = "";
        author = "";
    }

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

    public void setAuthor(String author) {

        this.author = author;
    }


}
