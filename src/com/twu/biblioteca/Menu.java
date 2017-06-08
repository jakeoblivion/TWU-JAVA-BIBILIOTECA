package com.twu.biblioteca;

import java.util.*;

public class Menu {
    Library library = new Library();
    AuthenticateUser authenticateUser = new AuthenticateUser();

    interface Command {
        void runCommand();
    }

    /*public  Map<String, Command> menuOptions = new HashMap<>();*/
    public  Map<String, String> menuOptions = new TreeMap<>();

    public  Map<String, String> generateMenuOptions(){
        System.out.println("----------------------------------------------------");
        System.out.println("Please type in the number of the menu option you want: ");
        System.out.println("-----------------------------------------------------");
        menuOptions.put("1. List Books", "getAvailableBookList");
        menuOptions.put("2. List Movies", "getAvailableMovieList");
        menuOptions.put("3. Checkout Item", "checkoutItem");
        menuOptions.put("4. Return Item", "returnItem");
        menuOptions.put("6. Quit", "Quit");
        printMenuOptions(menuOptions);
        return menuOptions;
    }

/*    public  Map<String, Command> generateMenuOptions(){
        System.out.println("--------- Menu Options ---------");
        menuOptions.put("List Books", library::getAvailableBookList);
        menuOptions.put("List Movies", library::getAvailableMovieList);
        menuOptions.put("Checkout Item", library::checkoutItem());
        menuOptions.put("Return Item", library::returnItem());
        menuOptions.put("Quit", BibliotecaApp::quit);
        printMenuOptions(menuOptions);
        return menuOptions;
    }*/


    public void selectMenuOption(String userInput) {
            switch(userInput) {
                case "1" :
                    System.out.println("===== AVAILABLE BOOKS LIST =====");
                    System.out.println("================================");
                    library.getAvailableBookList();
                    break;
                case "2" :
                    System.out.println("===== AVAILABLE MOVIE LIST =====");
                    System.out.println("================================");
                    library.getAvailableMovieList();
                    break;
                case "3" :
                    System.out.println("Please specify the title of the book/movie you want to check out:");
                    if(library.checkoutItem(UserInput.readUserInput())) {
                        System.out.println("Thank you! Enjoy your book/movie.");
                    } else {
                        System.out.println("This item is not available.");
                    }
                    break;
                case "4" :
                    System.out.println("Please specify the title of the book/movie you want to return:");
                    if(library.returnItem(UserInput.readUserInput())) {
                        System.out.println("Thank you for returning your book/movie.");
                    } else {
                        System.out.println("That is not a valid item to return.");
                    }
                    break;
                case "5" :
                    System.out.println("Please enter your username and Password");
                    if(authenticateUser.userLogin(UserInput.readUserInput(),UserInput.readUserInput())) {
                        authenticateUser.currentUser.getUserInfo();
                    }
                    else {
                        System.out.println("Incorrect login details.");
                    }
                    break;

                case "6" :
                    System.out.print("Quiting...");
                    BibliotecaApp.quit();
                    break;
                default : System.out.println('"' + userInput + '"' + " is not a valid option!");
                    break;
            }
    }

    private void printMenuOptions(Map<String, String> options) {
        for(Object menuItem : options.keySet().toArray()) {
            System.out.println(menuItem);
        }
    }
}
