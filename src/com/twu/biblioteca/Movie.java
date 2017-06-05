package com.twu.biblioteca;

public class Movie {
    public String name;
    public int year;
    public String director;
    public int rating;
    public boolean available;

    public Movie(String name, int year, String director, int rating, boolean available) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.available = available;
    }

}
