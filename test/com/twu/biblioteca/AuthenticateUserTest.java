package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class AuthenticateUserTest {
    private AuthenticateUser authenticateUser = new AuthenticateUser();
    private TextFromStandardInputStream systemIn = emptyStandardInputStream();

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
    public void returnTrueIfUserExistsInSystem() throws Exception {
        authenticateUser.checkIfLoggedIn();
        systemIn.provideText("123-4567");
        systemIn.provideText("password1");
        assertTrue(outContent.toString().contains("Jacob"));
    }
    
    @Test
    public void returnFalseIfUserExistsNotInSystem() throws Exception {
        //assertFalse(authenticateUser.userInSystem("123-4568","password3"));
    }
}