package com.twu.biblioteca;

import java.util.Scanner;

public class UserInput {

    static String readUserInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Please type in one of the above menu options: ");
        return reader.nextLine();
    }

    public static void runCommandFromInput(Menu menu, String userInput) {
        if(menu.menuOptions.containsKey(userInput)) {
            menu.menuOptions.get(userInput).runCommand();
            readUserInput();
        } else {
            System.out.println('"' + userInput + '"' + " is not a valid option!");
            readUserInput();
        }
    }
}
