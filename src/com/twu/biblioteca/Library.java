package com.twu.biblioteca;

import java.util.*;

public class Library {
    public HashMap<String, Book> bookList = new HashMap<String, Book>() {{
        this.put("Harry Potter", new Book("Harry Potter", "JK Rowling", 2000, true));
        this.put("Lord of the Rings", new Book("Lord of the Rings", "JR Tolkien", 2001, true));
        this.put("Da Vinci Code", new Book("Da Vinci Code", "Dan Brown", 2003, false));
    }};

    public HashMap<String, Movie> movieList = new HashMap<String, Movie>() {{
        this.put("Inception", new Movie("Inception", 2009, "Christopher Nolan", 10, true));
        this.put("Illusionist", new Movie("Illusionist", 2010, "Neil Burger", 9, false));
    }};

    private Map<Book, String> checkedOutBooks = new HashMap<>();
    private Map<Movie, String> checkedOutMovies = new HashMap<>();

    public void printCheckedOutBooks() {
        for(Book book : checkedOutBooks.keySet()) {
            System.out.println(book.getTitle());
        }
    }

    public void printCheckedOutMovies() {
        for(Movie movie : checkedOutMovies.keySet()) {
            System.out.println(movie.getName());
        }
    }

    public HashMap<String, Book> getAvailableBookList() {
        HashMap<String, Book> availableBookList = new HashMap<>();
        for (Book book : bookList.values()) {
            if (book.isAvailable()) {
                availableBookList.put(book.getTitle(), book);
            }
        }
        printAvailableBookList(availableBookList);
        return availableBookList;
    }

    private void printAvailableBookList(HashMap<String, Book> availableBookList) {
        for (Book book : availableBookList.values()) {
            System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getYearPublished());
        }
    }

    public HashMap<String, Movie> getAvailableMovieList() {
        HashMap<String, Movie> availableMovieList = new HashMap<>();
        for (Movie movie : movieList.values()) {
            if (movie.isAvailable()) {
                availableMovieList.put(movie.getName(), movie);
            }
        }
        printAvailableMovieList(availableMovieList);
        return availableMovieList;
    }

    private void printAvailableMovieList(HashMap<String, Movie> availableMovieList) {
        for (Movie movie : availableMovieList.values()) {
            System.out.println(movie.getName() + " | " + movie.getYear() + " | " + movie.getDirector() + " | " + movie.getRating());
        }
    }

    public boolean checkoutItem(String userID, String libraryItem) {
        if (bookList.containsKey(libraryItem) && (bookList.get(libraryItem).isAvailable())) {
            bookList.get(libraryItem).setAvailable(false);
            checkedOutBooks.put(bookList.get(libraryItem), userID);
            return true;
        } else if (movieList.containsKey(libraryItem) && (movieList.get(libraryItem).isAvailable())) {
            movieList.get(libraryItem).setAvailable(false);
            checkedOutMovies.put(movieList.get(libraryItem),userID);
            return true;
        }
        return false;
    }

    public boolean returnItem(String userID, String libraryItem) {
        if (bookList.containsKey(libraryItem) && (!(bookList.get(libraryItem).isAvailable()))) {
            bookList.get(libraryItem).setAvailable(true);
            checkedOutBooks.remove(userID, bookList.get(libraryItem));
            return true;
        }
        if (movieList.containsKey(libraryItem) && (!(movieList.get(libraryItem).isAvailable()))) {
            movieList.get(libraryItem).setAvailable(true);
            checkedOutMovies.remove(userID, movieList.get(libraryItem));
            return true;
        }
        return false;

    }
}
