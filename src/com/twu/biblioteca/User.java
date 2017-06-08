package com.twu.biblioteca;

public class User {
    String libraryNumber;
    String name;
    String email;
    String phone;
    String password;

    public User(String libraryNumber, String name, String email, String phone, String password) {
        this.libraryNumber = libraryNumber;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getUserInfo() {
        return name + " " + email + " " + phone;
    }

}
