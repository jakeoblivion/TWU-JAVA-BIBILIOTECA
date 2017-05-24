package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MenuTest {
    private Menu menu = new Menu();
    Library library = new Library();

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void printMenuOptionsListBooksQuit() throws Exception {
        menu.generateMenuOptions(library);
        menu.printMenuOptions();
        assertEquals("List Books\r\nQuit\r\n",outContent.toString());
    }

    @Test
    public void generateMenuOptionsShouldMapOptionToMethodCommand() {
        assertTrue(menu.generateMenuOptions(library).containsKey("List Books"));
    }
}