package com.twu.biblioteca;

public class Movie {
    private String name;
    private int year;
    private String director;
    private String rating;
    private boolean available;

    public Movie(String name, int year, String director, String rating, boolean available) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.available = available;
    }

    public Movie(String name, int year, String director, boolean available) {
        this(name,year,director,"Unrated",available);
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

    public String getRating() {
        return rating;
    }
}
