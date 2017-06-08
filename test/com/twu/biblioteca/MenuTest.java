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
        assertTrue(outContent.toString().contains("List Books"));
        assertTrue(outContent.toString().contains("List Movies"));
        assertTrue(outContent.toString().contains("Checkout Item"));
        assertTrue(outContent.toString().contains("Return Item"));
        assertTrue(outContent.toString().contains("Quit"));
    }

    @Test
    public void generateMenuOptionsListCommands() {
        assertTrue(menu.generateMenuOptions().containsKey("1. List Books"));
    }

    @Test
    public void selectMenuOptionListBooksShouldReturnBookList() throws Exception {
        menu.generateMenuOptions();
        menu.selectMenuOption("1");
        assertTrue(outContent.toString().contains("Harry Potter"));
        assertTrue(outContent.toString().contains("Lord of the Rings"));
    }

    @Test
    public void selectMenuOptionListMoviesShouldReturnMovieList() throws Exception {
        menu.generateMenuOptions();
        menu.selectMenuOption("2");
        assertTrue(outContent.toString().contains("Inception"));
    }

    @Test
    public void selectMenuOptionGetUserInfo() throws Exception {
        menu.generateMenuOptions();
        menu.selectMenuOption("5");
        assertTrue(outContent.toString().contains("Jacob"));
    }
}