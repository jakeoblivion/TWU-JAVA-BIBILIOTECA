package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;

public class LibraryTest {

    private Library library = new Library();

    @Test
    public void getAvailableBookListShouldReturnHarrypotter() throws Exception {
        assertThat(library.getAvailableBookList(), hasItem(new Book("Harry Potter", "JK Rowling",2000,true)));
    }

    @Test
    public void checkoutBook() throws Exception {
        Book book = new Book("Lord of the Rings","JR Tolkien", 2000, true);
        library.checkoutBook(book);

        assertEquals(book.available, false);
    }

/*    @Test
    public void returnBook() throws Exception {
        Book book = new Book("Lord of the Rings","JR Tolkien", 2000, false);
        library.returnBook(book);

        assertEquals(book.available, true);
    }*/

}