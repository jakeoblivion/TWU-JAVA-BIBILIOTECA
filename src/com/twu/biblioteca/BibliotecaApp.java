package com.twu.biblioteca;

import java.io.IOException;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        BibliotecaApp.generateWelcomeMessage();
        Menu menu = new Menu();
        menu.generateMenuOptions();

        while(true) {
            menu.selectMenuOption(UserInput.readUserInput());
        }
    }

    public static void generateWelcomeMessage() {
        System.out.println("################################");
        System.out.println("#### Welcome to Biblioteca! ####");
        System.out.println("################################");
    }

    public static void quit() {
        System.out.print("Quiting...");
        System.exit(0);
    }
}
