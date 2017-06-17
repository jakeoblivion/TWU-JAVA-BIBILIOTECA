package com.twu.biblioteca;

public class User {


    private String libraryNumber;
    private String name;
    private String email;
    private String phone;
    private String password;


    public User(String libraryNumber, String name, String email, String phone, String password) {
        this.libraryNumber = libraryNumber;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getUserInfo() {
        return "Name: " + name + " | Email: " + email + " | Telephone: " + phone;
    }

}
