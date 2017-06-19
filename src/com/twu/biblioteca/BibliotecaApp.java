package com.twu.biblioteca;

import java.io.IOException;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        menu.generateWelcomeMessage();
        menu.generateMenuOptions();

        while(menu.isRunning()) {
                menu.selectMenuOption(UserInput.readUserInput());
            if(menu.isRunning()) {
                menu.generateMenuOptions();
            }
        }
    }
}
