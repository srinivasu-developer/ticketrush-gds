package com.ticketrush.gds.theatre.enums;

public enum MovieGenre {

    COMEDY("Comedy"),
    ACTION("Action"),
    ROM_COM("Rom Com"),
    THRILLER("Thriller");

    private final String genre;

    MovieGenre(final String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
