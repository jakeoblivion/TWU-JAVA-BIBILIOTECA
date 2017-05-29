package com.twu.biblioteca;

import java.util.*;

public class Library {

    public HashMap<String, Book> bookList = new HashMap<String,Book>(){{
            this.put("Harry Potter", new Book("Harry Potter", "JK Rowling", 2000, true));
            this.put("Lord of the Rings", new Book("Lord of the Rings", "JR Tolkien", 2001, true));
            this.put("Da Vinci Code", new Book("Da Vinci Code", "Dan Brown", 2003, false));
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

    public void checkoutBook(Book book) {
        if(book.available) {
            book.available = false;
            System.out.println("Thank you! Enjoy the book.");
        } else {
            System.out.println("That book is not available.");
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
