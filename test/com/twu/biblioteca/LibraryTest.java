package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library = new Library();

    @Test
    public void getAvailableBookListShouldReturnHarrypotter() throws Exception {
        assertTrue(library.getAvailableBookList().containsKey("Harry Potter"));
    }

    @Test
    public void getAvailableBookListShouldntReturnDaVinciCode() throws Exception {
        assertFalse(library.getAvailableBookList().containsKey("Da Vinci Code"));
    }

    @Test
    public void getAvailableMovieListShouldReturnInception() throws Exception {
        assertTrue(library.getAvailableMovieList().containsKey("Inception"));
    }

    @Test
    public void getAvailableMovieListShouldntReturnIllusionist() throws Exception {
        assertFalse(library.getAvailableMovieList().containsKey("Illusionist"));
    }

    @Test
    public void checkoutBookShouldMakeAvailabilityFalse() throws Exception {
        Book book = new Book("Lord of the Rings","JR Tolkien", 2000, true);
        library.checkoutBook(book);

        assertEquals(book.available, false);
    }

    @Test
    public void checkoutMovieShouldMakeAvailabilityFalse() throws Exception {
        Movie movie = new Movie("Inception", 2009, "Christopher Nolan", 10, true);
        library.checkoutMovie(movie);

        assertEquals(movie.available, false);
    }

    @Test
    public void returnBookShouldMakeAvailabilityTrue() throws Exception {
        Book book = new Book("Lord of the Rings","JR Tolkien", 2000, false);
        library.returnBook(book);

        assertEquals(book.available, true);
    }

}