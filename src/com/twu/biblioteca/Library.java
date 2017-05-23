package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {


    public List<Book> bookList = new ArrayList(Arrays.asList(
            new Book("Harry Potter", "JK Rowling",2000,true),
            new Book("Harry Potter 2", "JK Rowling",2001,true),
            new Book("Harry Potter 3", "JK Rowling",2002,false),
            new Book("Lord of the Rings","JR Tolkien", 2000, true)

    ));

    public List<Book> getAvailableBookList() {
        List<Book> availableBookList = new ArrayList<Book>();
        for(Book book : bookList) {
            if (book.available) {
                availableBookList.add(book);
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

/*    public void returnBook(Book book) {
        if(getAvailableBookList().contains(book)) {
            book.available = true;
            System.out.println("Thank you for returning the book.");
        } else {
            System.out.println("That is not a valid book to return. Please return it to the correct library or check your spelling.");
        }
    }*/
}
