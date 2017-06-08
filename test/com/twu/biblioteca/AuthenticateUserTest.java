package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthenticateUserTest {
    AuthenticateUser authenticateUser = new AuthenticateUser();

    @Test
    public void returnTrueIfUserExistsInSystem() throws Exception {
        assertTrue(authenticateUser.userLogin("123-4567","password1"));
    }

    @Test
    public void returnFalseIfUserExistsNotInSystem() throws Exception {
        assertFalse(authenticateUser.userLogin("123-4568","password3"));
    }
}