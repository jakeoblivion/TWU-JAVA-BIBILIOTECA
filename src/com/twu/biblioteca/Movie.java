package com.twu.biblioteca;

public class Movie {
    private String name;
    private int year;
    private String director;
    private int rating;
    private boolean available;

    public Movie(String name, int year, String director, int rating, boolean available) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }
}
