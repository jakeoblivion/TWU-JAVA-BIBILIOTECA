package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class MenuTest {
    private Menu menu = new Menu();

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
        menu.generateMenuOptions();
        menu.printMenuOptions();
        assertTrue(outContent.toString().contains("List Books"));
        assertTrue(outContent.toString().contains("Quit"));
    }

    @Test
    public void generateMenuOptionsShouldMapOptionToMethodCommand() {
        assertTrue(menu.generateMenuOptions().containsKey("List Books"));
    }

    @Test
    public void selectMenuOptionListBooksShouldReturnBookList() throws Exception {
        menu.generateMenuOptions();
        menu.selectMenuOption("List Books");
        assertTrue(outContent.toString().contains("Harry Potter"));
        assertTrue(outContent.toString().contains("Lord of the Rings"));
    }

}