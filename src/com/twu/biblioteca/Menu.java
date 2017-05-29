package com.twu.biblioteca;

import java.util.*;

public class Menu {

    interface Command {
        void runCommand();
    }

    public  Map<String, Command> menuOptions = new HashMap<>();

    public  Map<String, Command> generateMenuOptions(Library library){
        System.out.println("--------- Menu Options ---------");
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

    public void selectMenuOption(String userInput) {
        if (menuOptions.containsKey(userInput)) {
            menuOptions.get(userInput).runCommand();
        } else {
            System.out.println('"' + userInput + '"' + " is not a valid option!");
        }

    }

}
