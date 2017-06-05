package com.twu.biblioteca;

import java.util.Scanner;

public class UserInput {

    public static String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}