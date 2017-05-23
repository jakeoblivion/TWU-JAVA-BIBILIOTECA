package com.twu.biblioteca;

public class Book {
    public String title;
    public String author;
    public int yearPublished;
    public boolean available;

    public Book(String title, String author, int yearPublished, boolean available) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.available = available;
    }

}
