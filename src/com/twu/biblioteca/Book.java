package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean available;

    public Book(String title, String author, int yearPublished, boolean available) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
