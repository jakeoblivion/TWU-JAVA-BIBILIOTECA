package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UserTest {
    User user = new User("123-1234", "Jacob", "jacob@jacob.com", "077777777","password1");

    @Test
    public void returnNameEmailPhone() throws Exception {
        assertThat(user.getUserInfo(), is("Jacob jacob@jacob.com 077777777"));
    }

}