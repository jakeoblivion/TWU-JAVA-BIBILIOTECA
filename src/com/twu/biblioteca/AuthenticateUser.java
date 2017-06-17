package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class AuthenticateUser {
    User loggedInUser;

    public List<User> userList = new ArrayList<User>() {{
        this.add(new User("123-4567","Jacob","jacob@jacob.com","07222554444", "password1"));
        this.add(new User("123-4569","Rachel","rachel@rachel.com","0715444877", "password2"));
    }};

    public boolean checkIfLoggedIn() {
        if (loggedInUser == null) {
            return checkUserInSystem();
        }
        return true;
    }

    private boolean checkUserInSystem() {
        System.out.println("Please login first to use this feature." + System.lineSeparator() + "Library Number: ");
        String libraryNumber = UserInput.readUserInput();
        System.out.println("Password: ");
        String password = UserInput.readUserInput();

        for(User user : userList) {
            if((Objects.equals(user.getLibraryNumber(), libraryNumber))&&(Objects.equals(user.getPassword(), password))) {
                loggedInUser = user;
                return true;
            }
        }
        System.out.println("Incorrect login details.");
        return false;
    }

}
