package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library = new Library();
    String userID = "123-4567";

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
    public void checkoutItemBookShouldMakeAvailabilityFalse() throws Exception {
        library.checkoutItem(userID,"Lord of the Rings");
        assertFalse(library.bookList.get("Lord of the Rings").isAvailable());
    }

    @Test
    public void checkoutItemMovieShouldMakeAvailabilityFalse() throws Exception {
        library.checkoutItem(userID,"Illusionist");
        assertFalse(library.movieList.get("Illusionist").isAvailable());
    }

    @Test
    public void returnItemBookShouldMakeAvailabilityTrue() throws Exception {
        library.returnItem(userID,"Lord of the Rings");
        assertTrue(library.bookList.get("Lord of the Rings").isAvailable());
    }

    @Test
    public void returnItemMovieShouldMakeAvailabilityTrue() throws Exception {
        library.returnItem(userID,"Illusionist");
        assertTrue(library.movieList.get("Illusionist").isAvailable());
    }
}