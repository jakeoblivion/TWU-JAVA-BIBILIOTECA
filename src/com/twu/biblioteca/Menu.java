package com.twu.biblioteca;

import java.util.*;

public class Menu {

    interface Command {
        void runCommand();
    }

    Map<String, Command> menuOptions = new HashMap<>();

    public Map<String, Command> generateMenuOptions(Library library){
        menuOptions.put("List Books", library::getAvailableBookList);
        menuOptions.put("Quit", BibliotecaApp::quit);
        printMenuOptions();
        return menuOptions;
    }

    public void printMenuOptions() {
        for(String menuItem : menuOptions.keySet()) {
            System.out.println(menuItem);
        }
    }

}
