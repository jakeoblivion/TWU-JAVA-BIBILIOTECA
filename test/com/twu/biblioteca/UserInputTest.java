package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class UserInputTest {
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
    public void logInputToConsole() throws Exception {
        UserInput userInput = new UserInput();
        //userInput.readUserInput();
        //assertEquals("==========================\r\nPlease type in one of the above menu options: \r\n",outContent.toString());
    }

    @Test
    public void runCommandListBooksFromInputShouldListBooks() throws Exception {
        Menu menu = new Menu();
        Library library = new Library();
        menu.generateMenuOptions(library);
        menu.menuOptions.get("List Books").runCommand();
        assertEquals(true,outContent.toString().contains("Harry Potter\r\nLord of the Rings\r\n"));
    }
}