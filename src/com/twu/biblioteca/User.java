package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    Map<String, Book> checkedOutBooks = new HashMap<String, Book>(){{
        this.put("Da Vinci Code", (new Book("Da Vinci Code", "Dan Brown", 2003, true)));
    }};

    Map<String, Movie> checkedOutMovies = new HashMap<String, Movie>(){{
        this.put("Inception", new Movie("Inception", 2009, "Christopher Nolan", 10, true));
    }};

    String libraryNumber;
    String name;
    String email;
    String phone;
    String password;



    public User(String libraryNumber, String name, String email, String phone, String password) {
        this.libraryNumber = libraryNumber;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getUserInfo() {
        return "Name: " + name + " | Email: " + email + " | Telephone: " + phone;
    }

    public void printCheckedOutBooks() {
        for(Book book : checkedOutBooks.values()) {
            System.out.println(book.title);

        }
    }

    public void printCheckedOutMovies() {
        for(Movie movie : checkedOutMovies.values()) {
            System.out.println(movie.name);
        }
    }
}
