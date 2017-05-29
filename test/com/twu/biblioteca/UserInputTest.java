package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class UserInputTest {
    UserInput userInput = new UserInput();

    @Rule
    public TextFromStandardInputStream systemIn = emptyStandardInputStream();

    @Test
    public void getStringInput_ReturnsUserInputAsString() {
        systemIn.provideText("List Books");
        assertEquals("List Books", userInput.readUserInput());
    }
}

