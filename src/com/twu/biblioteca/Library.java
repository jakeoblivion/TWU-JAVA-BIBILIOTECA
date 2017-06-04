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
        System.out.println("===== AVAILABLE BOOKS LIST =====");
        System.out.println("================================");
        for(Book book : bookList.values()) {
            if (book.available) {
                availableBookList.put(book.title, book);
                System.out.println(book.title + " | " + book.author + " | " + book.yearPublished);
            }
        }
        return availableBookList;
    }

    public HashMap<String, Movie> getAvailableMovieList() {
        HashMap<String, Movie> availableMovieList = new HashMap<>();
        System.out.println("===== AVAILABLE BOOKS LIST =====");
        System.out.println("================================");
        for(Movie movie : movieList.values()) {
            if (movie.available) {
                availableMovieList.put(movie.name, movie);
                System.out.println(movie.name + " | " + movie.year + " | " + movie.director + " | " + movie.rating);
            }
        }
        return availableMovieList;
    }

    public void checkoutBook(Book book) {
        if(book.available) {
            book.available = false;
            System.out.println("Thank you! Enjoy the book.");
        } else {
            System.out.println("That book is not available.");
        }
    }

    public void checkoutMovie(Movie movie) {
        if(movie.available) {
            movie.available = false;
            System.out.println("Thank you! Enjoy the movie.");
        } else {
            System.out.println("That movie is not available.");
        }
    }


    public void returnBook(Book book) {
        if(getAvailableBookList().containsKey(book.title)) {
            book.available = true;
            System.out.println("Thank you for returning the book.");
        } else {
            System.out.println("That is not a valid book to return.");
        }
    }
}
