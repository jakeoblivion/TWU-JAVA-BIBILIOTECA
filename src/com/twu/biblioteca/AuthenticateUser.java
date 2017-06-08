package com.twu.biblioteca;

import java.util.HashMap;

public class AuthenticateUser {
    User currentUser;

    public HashMap<String, User> userList = new HashMap<String, User>() {{
        this.put("123-4567", new User("123-4567","Jacob","jacob@jacob.com","07222554444", "password1"));
        this.put("123-4569", new User("123-4569","Rachel","rachel@rachel.com","0715444877", "password2"));
    }};


    public boolean userLogin(String libraryNumber, String password) {
        for(User user : userList.values()) {
            if((user.libraryNumber == libraryNumber)&&(user.password == password)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

}
