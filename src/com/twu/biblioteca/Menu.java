package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<String> menuOptions = new ArrayList<>();

    public List<String> getMenuOptions() {
        menuOptions.add("List Books");
        menuOptions.add("Quit");
        return menuOptions;
    }

}
