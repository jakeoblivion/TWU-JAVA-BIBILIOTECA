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
        assertTrue(outContent.toString().contains("1. List Books"));
    }

    @Test
    public void displaysWelcomeMessage() throws Exception {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        menu.generateWelcomeMessage();
        assertTrue(outContent.toString().contains("#### Welcome to Biblioteca! ####"));
    }

    @Test
    public void quitApplicationWithMessage() throws Exception {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        menu.quit();
        assertEquals("Quiting...",outContent.toString());
    }
}