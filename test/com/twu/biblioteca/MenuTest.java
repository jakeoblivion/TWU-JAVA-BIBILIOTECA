package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MenuTest {
    private Menu menu = new Menu();

    @Test
    public void getMenuOptions() throws Exception {
    assertTrue(menu.getMenuOptions().contains("List Books"));
    }

}