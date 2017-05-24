package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

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
    public void displaysWelcomeMessage() throws Exception {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.generateWelcomeMessage();
        assertEquals(
                "==========================\r\n" +
                         "==Welcome to Biblioteca!==\r\n" +
                         "==========================\r\n",
                outContent.toString());
    }

    @Test
    public void quitApplicationWithMessage() throws Exception {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        //bibliotecaApp.quit();
        //assertEquals("Quiting...",outContent.toString());
    }


}