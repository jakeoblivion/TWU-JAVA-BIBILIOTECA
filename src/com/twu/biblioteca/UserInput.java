package com.twu.biblioteca;

import java.util.Scanner;

public class UserInput {

    public static String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("Please type in one of the above menu options: ");
        return scanner.nextLine();
    }

}