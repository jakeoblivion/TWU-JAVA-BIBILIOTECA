package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.generateWelcomeMessage();

        Library library = new Library();
        Menu menu = new Menu();
        menu.generateMenuOptions(library);

        UserInput.runCommandFromInput(menu, UserInput.readUserInput());
    }

    public void generateWelcomeMessage() {
        System.out.println("==========================");
        System.out.println("==Welcome to Biblioteca!==");
        System.out.println("==========================");
    }

    public static void quit() {
        System.out.print("Quiting...");
        System.exit(0);
    }
}
