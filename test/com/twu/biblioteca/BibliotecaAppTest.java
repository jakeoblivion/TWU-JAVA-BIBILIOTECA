package com.twu.biblioteca;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

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
    public void generateWelcomeMessage() throws Exception {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.generateWelcomeMessage();
        assertEquals("Welcome to Biblioteca!",outContent.toString());
    }

}