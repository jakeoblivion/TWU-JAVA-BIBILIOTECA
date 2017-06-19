package com.twu.biblioteca;

public class Menu {
    private boolean running = true;
    Library library = new Library();
    AuthenticateUser authenticateUser = new AuthenticateUser();

    public boolean isRunning() {
        return running;
    }

    public void quit() {
        running = false;
        System.out.print("Quiting...");
    }

    public static void generateWelcomeMessage() {
        System.out.println("################################");
        System.out.println("#### Welcome to Biblioteca! ####");
        System.out.println("################################");
    }

    public void generateMenuOptions(){
        System.out.println("----------------------------------------------------");
        System.out.println("Please type in the number of the menu option you want: ");
        System.out.println("-----------------------------------------------------");
        System.out.println("1. List Books");
        System.out.println("2. List Movies");
        System.out.println("3. Checkout Item");
        System.out.println("4. Return Item");
        System.out.println("5. My User Information");
        System.out.println("6. Checked Out Items");
        System.out.println("7. Quit");
    }

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
                    if(authenticateUser.checkIfLoggedIn()) {
                        System.out.println("Please specify the title of the book/movie you want to check out:");
                        if (library.checkoutItem(authenticateUser.loggedInUser.getLibraryNumber(), UserInput.readUserInput())) {
                            System.out.println("Thank you! Enjoy your book/movie.");
                        } else {
                            System.out.println("This item is not available.");
                        }
                    }
                    break;
                case "4" :
                    if(authenticateUser.checkIfLoggedIn()) {
                        System.out.println("Please specify the title of the book/movie you want to return:");
                        if (library.returnItem(authenticateUser.loggedInUser.getLibraryNumber(), UserInput.readUserInput())) {
                            System.out.println("Thank you for returning your book/movie.");
                        } else {
                            System.out.println("That is not a valid item to return.");
                        }
                    }
                    break;
                case "5" :
                    if(authenticateUser.checkIfLoggedIn()) {
                        System.out.println(authenticateUser.loggedInUser.getUserInfo());
                    }
                    break;
                case "6" :
                    if(authenticateUser.checkIfLoggedIn()) {
                        System.out.println("================================");
                        System.out.println("The following items have been checked out by you: ");
                        library.printCheckedOutBooks();
                        library.printCheckedOutMovies();
                    }
                    break;
                case "7" :
                    quit();
                    break;
                default : System.out.println('"' + userInput + '"' + " is not a valid option!");
                    break;
            }
    }
}
