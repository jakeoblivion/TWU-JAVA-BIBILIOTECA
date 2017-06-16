package com.twu.biblioteca;

import java.util.*;

public class Library {

    public HashMap<String, Book> bookList = new HashMap<String,Book>(){{
            this.put("Harry Potter", new Book("Harry Potter", "JK Rowling", 2000, true));
            this.put("Lord of the Rings", new Book("Lord of the Rings", "JR Tolkien", 2001, true));
            this.put("Da Vinci Code", new Book("Da Vinci Code", "Dan Brown", 2003, false));
    }};

    public HashMap<String, Movie> movieList = new HashMap<String,Movie>(){{
        this.put("Inception", new Movie("Inception", 2009, "Christopher Nolan", 10, true));
        this.put("Illusionist", new Movie("Illusionist", 2010, "Neil Burger", 9, false));
    }};

    public HashMap<String, Book> getAvailableBookList() {
        HashMap<String, Book> availableBookList = new HashMap<>();
        for(Book book : bookList.values()) {
            if (book.available) {
                availableBookList.put(book.title, book);
            }
        }
        printAvailableBookList(availableBookList);
        return availableBookList;
    }

    private void printAvailableBookList(HashMap<String, Book> availableBookList) {
        for(Book book : availableBookList.values()) {
            System.out.println(book.title + " | " + book.author + " | " + book.yearPublished);
        }
    }

    public HashMap<String, Movie> getAvailableMovieList() {
        HashMap<String, Movie> availableMovieList = new HashMap<>();
        for(Movie movie : movieList.values()) {
            if (movie.available) {
                availableMovieList.put(movie.name, movie);
            }
        }
        printAvailableMovieList(availableMovieList);
        return availableMovieList;
    }

    private void printAvailableMovieList(HashMap<String, Movie> availableMovieList) {
        for(Movie movie : availableMovieList.values()) {
            System.out.println(movie.name + " | " + movie.year + " | " + movie.director + " | " + movie.rating);
        }
    }

    public boolean checkoutItem(String libraryItem) {
        return (checkoutBook(libraryItem)||checkoutMovie(libraryItem));
    }

    private boolean checkoutBook(String libraryItem) {
        if(bookList.containsKey(libraryItem)&&(bookList.get(libraryItem).available)) {
            bookList.get(libraryItem).available = false;
            return true;
        }
        return false;
    }

    private boolean checkoutMovie(String libraryItem) {
        if(movieList.containsKey(libraryItem)&&(movieList.get(libraryItem).available)) {
            movieList.get(libraryItem).available = false;
            return true;
        }
        return false;
    }

    public boolean returnItem(String libraryItem) {
        return (returnBook(libraryItem)||returnMovie(libraryItem));
    }

    private boolean returnBook(String libraryItem) {
        if(bookList.containsKey(libraryItem)&&(!(bookList.get(libraryItem).available))) {
            bookList.get(libraryItem).available = true;
            return true;
        }
        return false;
    }

    private boolean returnMovie(String libraryItem) {
        if(movieList.containsKey(libraryItem)&&(!(movieList.get(libraryItem).available))) {
            movieList.get(libraryItem).available = true;
            return true;
        }
        return false;
    }
}
